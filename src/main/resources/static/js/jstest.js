/**
 你的js文件
 **/

//我们强烈推荐你在代码最外层把需要用到的模块先加载
layui.use(['layer', 'form', 'element'], function(){
    var layer = layui.layer
        ,form = layui.form
        ,element = layui.element
    document.write("<h1>This is a heading</h1>");
    //你的代码都应该写在这里面
});