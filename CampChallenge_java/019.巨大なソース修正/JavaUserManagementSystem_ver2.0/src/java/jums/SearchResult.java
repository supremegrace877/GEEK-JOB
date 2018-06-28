package jums;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchResult extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try{
            request.setCharacterEncoding("UTF-8");//リクエストパラメータの文字コードをUTF-8に変更
            //セッション開始
            HttpSession hs = request.getSession();
            //フォームからの入力を取得して、JavaBeansに格納
            UserDataBeans udb = new UserDataBeans();
            udb.setName(request.getParameter("name"));
            udb.setYear(request.getParameter("year"));
            udb.setType(request.getParameter("type"));
            
            //nullじゃなかったらDTOオブジェクトにマッピング。DB専用のパラメータに変換
            if(!udb.getName().equals("") && udb.getYear() != 0 && udb.getType() != 0){
                UserDataDTO searchData = new UserDataDTO();
                udb.UD2DTOMapping(searchData);
                UserDataDTO resultData = UserDataDAO.getInstance().search(searchData);
                
                request.setAttribute("resultData", resultData);
                
                //一致しない場合
                if(resultData.getName() == null){
                    out.println("一致するものがありません。");
                
                }else{
                
                //セッションにresultdataを格納
                hs.setAttribute("resultData",resultData);
                
                //jspに遷移
                request.getRequestDispatcher("/searchresult.jsp").forward(request, response);  
                }
                
            }else{
                out.println("正確な値を入力してください。");}
            
        }catch(Exception e){
            //何らかの理由で失敗したらエラーページにエラー文を渡して表示。想定は不正なアクセスとDBエラー
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
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
