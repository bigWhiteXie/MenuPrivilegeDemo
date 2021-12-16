<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/6 0006
  Time: 下午 14:07
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    //http://localhost:8080/01_sxtoa_war_exploded/
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
    <%--引入EasyUI的资源--%>
    <link rel="stylesheet" type="text/css" href="static/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="static/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="static/demo.css">
    <script type="text/javascript" src="static/js/jquery.min.js"></script>
    <script type="text/javascript" src="static/js/jquery.easyui.min.js"></script>
    <%--声明js代码域--%>
    <script type="text/javascript">
        //登录页面置顶显示
        if(window.top.location!=window.location){
            window.top.location="login.jsp";
        }


        //声明页面加载事件，完成panel面板的初始化
        $(function () {
            $("#p").panel({
                //属性初始化
                //事件初始化
                onOpen:function () {
                   $("#p").panel('maximize')
                }
            })
        })
        //声明页面加载事件，完成表单的异步提交
        $(function () {
            //给登录按钮添加单击事件
            $("#btn").click(function () {
                $("#loginFm").form('submit',{
                    url:'login',
                    success:function (data) {//该方法只要有响应内容就会触发，无关正确还是错误
                         if(eval(data)){
                             window.location.href="main.jsp";
                         }else{
                             $("#flagSpan").html("用户名或密码错误");
                         }
                    }
                })
            })

        })

    </script>
</head>
<body>
    <div style="text-align: center;margin-top: 80px;">
        <span id="flagSpan" style="color: red;"></span>
    </div>
    <div style="width: 430px;height: 230px;margin: auto;text-align: center;">

        <%--创建panel面板完成页面布局--%>
        <div id="p" class="easyui-panel" title="请登录"  data-options="iconCls:'icon-save',fit:true
                ,collapsible:true,minimizable:true,maximizable:true,closable:true">
           <%--创建form表单--%>
               <form id="loginFm" method="post">
                   <table cellpadding="10px" style="margin: auto;margin-top: 20px;">
                       <tr>
                           <td>
                              <input class="easyui-textbox" name="uname" label="用户名:" prompt="请输入用户名" style="width:300px">
                           </td>
                       </tr>
                       <tr>
                           <td>
                               <input class="easyui-passwordbox" name="pwd" label="密码:" prompt="请输入用户名" style="width:300px">
                           </td>
                       </tr>
                       <tr>
                           <td>
                               <a id="btn" href="javascript:void(0)" class="easyui-linkbutton">点击登录</a>
                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                               <input class="easyui-checkbox" name="fruit" value="Apple" labelPosition="after" label="记住密码">
                           </td>
                       </tr>
                   </table>
               </form>


        </div>


    </div>

</body>
</html>
