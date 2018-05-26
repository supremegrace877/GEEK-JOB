
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class form_sonyu extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Kensaku</title>");            
            out.println("</head>");
            out.println("<body>");
          
        Connection db_con = null;
        PreparedStatement db_st=null;
        ResultSet db_data=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            db_con=DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST","haruka","haruka72006");
            db_st=db_con.prepareStatement("insert into profiles (profilesID,name,tel,age,birthday) values(?,?,?,?,?)");
//            getParameterで受け取る
//            その前に文字コード指定して文字化け防ぐ
            request.setCharacterEncoding("UTF-8");
            String id = (String)request.getParameter("txtProfilesID");
            String na = (String)request.getParameter("txtName");
            String te = (String)request.getParameter("txtTel");
            String ag = (String)request.getParameter("txtAge");
            String bi = (String)request.getParameter("txtBirthday");
            
//            %はここでつける↓
            db_st.setString(1,id);
            db_st.setString(2,na);
            db_st.setString(3,te);
            db_st.setString(4,ag);
            db_st.setString(5,bi);
            int update_rows ;
            update_rows = db_st.executeUpdate();
            System.out.println(update_rows);
            
            
        }catch(Exception e){
            System.out.println("接続時にエラーが発生しました:"+e.toString());
        }finally{
            try{
                db_con.close();
                db_st.close();
                db_data.close();
            }catch(Exception e){
            System.out.println(e.getMessage());    
            }
        }
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
