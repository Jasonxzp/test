<template>
  <div>
    <h1>Num</h1>
    <el-input v-model="input" placeholder="输入文本" />
    <el-button @click="onButtonClick" type="primary">点击按钮</el-button>
    <el-button @click="remote" type="primary">remote</el-button>
    <p>输入的文本: {{ input }}</p>
  </div>
</template>

<script setup>
import axios from "axios";
import { ref } from "vue";

const input = ref("Test");

function onButtonClick() {
  input.value = "Page";
}

function remote() {
  console.log("test".value);
  axios
    .get("/remote/api/person/2")
    .then(() => {
      input.value = "OK";
    })
    .catch((error) => {
      // 失败时将错误消息显示在输入框中
      input.value = "Error: " + error.message;
    });
}
</script>
