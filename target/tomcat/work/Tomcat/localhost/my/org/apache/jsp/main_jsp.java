/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-11-22 10:13:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    //http://localhost:8080/01_sxtoa_war_exploded/

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/themes/default/easyui.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/themes/icon.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/demo.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"static/js/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"static/js/jquery.easyui.min.js\"></script>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        //声明页面加载事件，给树组件添加单击事件\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $('#tt').tree({\r\n");
      out.write("                onLoadError:function(){//该函数被触发则表明过滤器中的session校验失败\r\n");
      out.write("                    window.location.href=\"login.jsp\";\r\n");
      out.write("                },\r\n");
      out.write("                onClick: function (node) {\r\n");
      out.write("                    console.log(node)\r\n");
      out.write("                    if(node.attributes.isparent==1){\r\n");
      out.write("                        return;\r\n");
      out.write("                    }\r\n");
      out.write("                    //判断是否已经存在标签页\r\n");
      out.write("                    var has=$(\"#tabsDiv\").tabs('exists',node.text);\r\n");
      out.write("                  if(has){\r\n");
      out.write("                      //选择已经存在的标签页\r\n");
      out.write("                      $(\"#tabsDiv\").tabs('select',node.text);\r\n");
      out.write("                  }else{\r\n");
      out.write("                      //新增标签页\r\n");
      out.write("                      $(\"#tabsDiv\").tabs('add',{\r\n");
      out.write("                          title:node.text,\r\n");
      out.write("                          closable:true,\r\n");
      out.write("                          content:\"<iframe  src='\"+node.attributes.url+\"' style='border: none' width='99%' height='99%'/>\"\r\n");
      out.write("                      })\r\n");
      out.write("                  }\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("\r\n");
      out.write("<div data-options=\"region:'north'\" style=\"height:75px;background-image: url('static/images/bg.png')\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <span>\r\n");
      out.write("            <img style=\"margin-top: 15px;position: relative;left: 10px;\" src=\"static/images/logo.png\" width=\"260px\">\r\n");
      out.write("        </span>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <span style=\"color: white;font-size:15px;font-weight:bold;float: right;position: relative;top:40px;right: 50px;\">\r\n");
      out.write("            当前登录: 张三\r\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            <a href=\"\" style=\"text-decoration: none;color: red;\">退出</a>\r\n");
      out.write("        </span>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div data-options=\"region:'south'\" style=\"height:50px;text-align: center\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <span style=\"font-weight: bold;position: relative;top:8px;\">\r\n");
      out.write("        &copy;仅供学习交流使用，商用必究！当前版本:ADGHJ00099,备案号:990008877\r\n");
      out.write("    </span>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div data-options=\"region:'west',title:'系统菜单'\" style=\"width:200px;\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <ul id=\"tt\" class=\"easyui-tree\" data-options=\"url:'menuInfo'\"></ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div data-options=\"region:'center'\" style=\"padding:5px;background:#eee;\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div id=\"tabsDiv\" class=\"easyui-tabs\" fit=\"true\" style=\"width:500px;height:250px;\">\r\n");
      out.write("        <div title=\"首页\" style=\"padding:20px;display:none;\"> tab1</div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}