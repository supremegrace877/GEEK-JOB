package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Session2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>セッション</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            HttpSession hs = request.getSession();
            String str_name = (String) hs.getAttribute("txtName");
            String str_gender = (String) hs.getAttribute("gender");
            String str_hobby = (String) hs.getAttribute("hobby");
            //nullだとエラーが出てしまうので、nullを文字列に変える。
            if (str_name == null) {
                str_name = "";
            }
            if (str_gender == null) {
                str_gender = "";
            }
            if (str_hobby == null) {
                str_hobby = "";
            }

        
      out.write("\n");
      out.write("        <form action=\"./Session2\" method=\"post\">\n");
      out.write("            <p>氏名：<input type=\"text\" name=\"txtName\" value=");
out.print(str_name);
      out.write("></p>\n");
      out.write("            <p>性別：<input type=\"radio\" name=\"gender\" value=\"男\" ");
if (str_gender.equals("男")) {
                     out.print("checked");
                 }
      out.write("> 男\n");
      out.write("                <input type=\"radio\" name=\"gender\" value=\"女\"");
if (str_gender.equals("女")) {
                                  out.print("checked");
                              }
      out.write("> 女</p>\n");
      out.write("            <p>趣味：<textarea name=\"hobby\">");
out.print(str_hobby);
      out.write("</textarea></p>\n");
      out.write("\n");
      out.write("            <p><input type=\"submit\" name=\"sent\" value=\"送信\"></p>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
