/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author onishiharuka
 */
public class hikisumodoriti1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*・引数 
　文字列型 
・戻り値 
　文字列型を要素に持つ配列型 
・処理内容 
　３人分のプロフィール情報を，それぞれ配列で作成してください（プロフィール情報の項目は，課題「戻り値2」と同様です）。
    そして，引数として受け取った ID の値と同じ ID の値を持つ配列を，戻り値として返してください。 

メソッドの呼び出し側の記述については，課題「戻り値2」と同様としてください。*/
    String[] profile(String number){
    
    String[] data1={"012","19981225","埼玉県"};
    String[] data2={"345","19880701","久我山"};
    String[] data3={"678","19960707","西荻窪"};

    if(number==data1[0]){
    return data1;
    }
    else if(number==data2[0]){
    return data2;
    }
    else if(number==data3[0]){
    return data3;
    }
    return null;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hikisumodoriti1</title>");            
            out.println("</head>");
            out.println("<body>");
         
         
            String[] DATA =profile("345");
            
            for (int i=1;i<3;i++){
                out.print(DATA[i]+"<br>");
            }   
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
