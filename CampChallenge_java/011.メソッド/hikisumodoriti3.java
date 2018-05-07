/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author onishiharuka
 */
public class hikisumodoriti3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*課題「引数，戻り値２」を改修します。
整数型の変数 limit を値 2 で用意してください。そして，limit を利用して，
    表示するプロフィール情報を２名分のみにしてください。*/
    String[] profile(String number) {

        String[] data1 = {"012", "19981225", "埼玉県"};
        String[] data2 = {"345", "19880701", "久我山"};
        String[] data3 = {"678", "19960707", null};

        if (number == data1[0]) {
            return data1;
        } else if (number == data2[0]) {
            return data2;
        } else if (number == data3[0]) {
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
            out.println("<title>Servlet hikisumodoriti3</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String[]DATA1=profile("012");
            String[]DATA2=profile("345");
            String[]DATA3=profile("678");
            ArrayList<String[]> number=new ArrayList <String[]>();
            number.add(DATA1);
            number.add(DATA2);
            number.add(DATA3);
            
            int limit=2;    
            for(int i=0; i<limit; i++){
                String[] member=number.get(i);
                
//                for(int s=0;s<3;s++){
                out.print("IDは"+member[0]+"、生年月日は"+member[1]+"、住所は"+member[2]);
                
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
