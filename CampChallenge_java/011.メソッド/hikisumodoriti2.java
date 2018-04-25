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

/**
 *
 * @author onishiharuka
 */
public class hikisumodoriti2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    /*引数　文字列型
・戻り値　配列（ArrayList で実現してもOK）
・処理内容
　３人分のプロフィール情報を，それぞれ配列で作成してください（プロフィール情報の項目は，課題「引数、戻り値1」と同様です）。
    ただし，そのうちの１人については，住所 の値を null にしてください。
　そして，引数で受け取った文字列と ID の値が一致する人物について，そのプロフィール情報の配列を戻り値としてください。

　メソッドを作成したら，このメソッドを適宜呼び出し，３人分のプロフィール情報をすべて画面に表示してください。
    ただし，値が null なデータについては continue; を利用して画面表示をスキップしてください。*/
   String[] profile(String number){
    
    String[] data1={"012","19981225","埼玉県"};
    String[] data2={"345","19880701","久我山"};
    String[] data3={"678","19960707",null};

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
            out.println("<title>Servlet hikisumodoriti2</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String[] DATA1 =profile("012");
            
            for (int i=0;i<3;i++){
                out.print(DATA1[i]+"<br>");
            }   
            
            String[] DATA2 =profile("345");
            for (int i=0;i<3;i++){
                out.print(DATA2[i]+"<br>");
            }
            String[] DATA3 =profile("678");
            
            for (int s=0;s<3;s++){
                if(DATA3[s]==null){
                continue;
                }
                else{
                out.print(DATA3[s]+"<br>");
                }
                
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


