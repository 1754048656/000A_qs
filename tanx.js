// 查看谁喜欢我
// 定义方法钩子
function hookMethods() {
    try {
      // 获取User类
      var userClass = Java.use("com.tantan.x.db.user.a.f");
  
      // Hook bA 方法
      userClass.bA.implementation = function (user) {
        console.log("Calling bA method, returning true...");
        return true;
      };
  
      // Hook K 方法
      userClass.K.implementation = function (user) {
        console.log("Calling K method, returning true...");
        return true;
      };
  
      // Hook R 方法
      userClass.R.implementation = function (user) {
        console.log("Calling R method, returning true...");
        return true;
      };
  
      // Hook S 方法
      userClass.S.implementation = function (user) {
        console.log("Calling S method, returning true...");
        return true;
      };
  
      // Hook w 方法
      userClass.w.implementation = function (user) {
        console.log("Calling w method, returning true...");
        return true;
      };
  
      // Hook x 方法
      userClass.x.implementation = function (user) {
        console.log("Calling x method, returning true...");
        return true;
      };
    } catch (err) {
      console.log("Error: " + err.message);
    }
  }
  

  
  function main() {
    // 启动
    Java.perform(function () {
      hookMethods();
    });
  }

  setImmediate(main)