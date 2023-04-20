function hookMethods() {
  // 获取对应 Class
  var userClass = Java.use('com.tantan.x.db.user.a.f');
  
  // Hook 方法 aa
  // userClass.aa.implementation = function(user) {
  //   // 执行原方法
  //   var result = this.aa(user);
  //   return true;
  // }

  // // Hook 方法 A
  // userClass.A.implementation = function(user) {
  //   var result = this.A(user);
  //   return true;
  // }

  // // Hook 方法 ag
  // userClass.ag.implementation = function(user) {
  //   var result = this.ag(user);
  //   return true;
  // }

  // // Hook 方法 B
  // userClass.B.implementation = function(user) {
  //   var result = this.B(user);
  //   return true;
  // }

  // // Hook 方法 bd
  // userClass.bd.implementation = function(user) {
  //   var result = this.bd(user);
  //   return true;
  // }

  // // Hook 方法 bQ
  // userClass.bQ.implementation = function(user) {
  //   var result = this.bQ(user);
  //   return true;
  // }

  // Hook 方法 e
  // userClass.e.overload('com.tantan.x.db.user.User').implementation = function(user) {
  //   var result = this.e(user);
  //   return true;
  // }

  // Hook 方法 H
  userClass.H.implementation = function(user) {   // 黄钻石
    var result = this.H(user);
    return true;
  }

  // Hook 方法 J
  userClass.J.implementation = function(user) {
    var result = this.J(user);
    return true;
  }

  // // Hook 方法 q
  // userClass.q.implementation = function(user) { // Verifications
  //   var result = this.q(user);
  //   return false;
  // }

  // // Hook 方法 t
  // userClass.t.implementation = function(user) {
  //   var result = this.t(user);
  //   return true;
  // }

  // // Hook 方法 y
  // userClass.y.implementation = function(user) {
  //   var result = this.y(user);
  //   return true;
  // }
}

function main() {
  // 启动
  Java.perform(function () {
    hookMethods();
  });
}

setImmediate(main)