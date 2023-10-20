package com.controller;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapper.PersonMapper;
import com.pojo.Person;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	
	@Autowired
	PersonMapper personMapper ;
	@GetMapping("/{id}")
	public Person get(@PathVariable Integer id) {
		Person person = personMapper.selectByPrimaryKey(id);
		
		System.out.println(person);
		
		return person;
	}
	
}
