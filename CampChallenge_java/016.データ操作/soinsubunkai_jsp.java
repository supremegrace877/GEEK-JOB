package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class soinsubunkai_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        request.setCharacterEncoding("UTF-8");
        request.getParameter("soinsubunkai");
        
        if(request.getParameter("soinsubunkai").equals("")){
            out.print("入力してください");
        }else{
            out.print(request.getParameter("soinsubunkai"));
            int num=(Integer.parseInt(request.getParameter("soinsubunkai")));
        
            ArrayList<String> bunkai = new ArrayList<String>();
        
            //2か3か5か7で割れたか判定する。
            boolean flag = false;
        
            if(num%2!=0&&num%3!=0&&num%5!=0&&num%7!=0){
            out.print("<br>この数は素数です!!");
            //ここで処理を終わらせたいのでreturn;を使う。
            //break;はループ処理のときだけ
            return;
        
            }else{
                bunkai.add("=");
            
                //==は右辺と左辺が同じという意味
                //=は右辺を左辺に代入する
                if(num%2==0){
                   while(num%2==0){
                   num/=2;
                   bunkai.add("2*");
                   flag=true;
                   }
                                      
                }if(num%3==0){
                   while(num%3==0){
                   num/=3;
                   bunkai.add("3*");
                   flag=true;
                   }
               
                }if(num%5==0){
                   while(num%5==0){
                   num/=5;
                   bunkai.add("5*");
                   flag=true;
                   }
               
                }if(num%7==0){
                   while(num%7==0){
                   num/=7;
                   bunkai.add("7*");
                   flag=true;
                   }
                }
            
                }if(flag=true){
                   String endlist = bunkai.get(bunkai.size()-1);
                   bunkai.set(bunkai.size()-1,endlist.substring(0,1));
               
                }if(flag=true&&num==1){
                    //処理なし
                
                }else if(num!=0){
                   bunkai.add("あまり"+num);
               
                }else{
                    //処理なし
                }
            
            for(int i=0;i<bunkai.size();i++){
            out.print(bunkai.get(i));
            }
        }
               
        
      out.write("\n");
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
