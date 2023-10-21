const { defineConfig } = require("@vue/cli-service");
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    proxy: {
      "/remote": {
        target: "http://127.0.0.1:5353",
        //允许跨域
        changeOrigin: true,
        ws: true,
        pathRewrite: {
          "^/remote": "",
        },
      },
    },
  },
});
