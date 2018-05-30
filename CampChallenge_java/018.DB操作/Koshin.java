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

public class Koshin extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Koshin</title>");            
            out.println("</head>");
            out.println("<body>");
            
            Connection db_con = null;
            PreparedStatement db_st=null;
            ResultSet db_data=null;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                db_con=DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST","haruka","haruka72006");
                db_st=db_con.prepareStatement("update profiles set name=?,tel=?,age=?,birthday=? where profilesID=?");
    //            getParameterで受け取る
    //            その前に文字コード指定して文字化け防ぐ
                request.setCharacterEncoding("UTF-8");
                String id = (String)request.getParameter("txtProfilesID");
                String na = (String)request.getParameter("txtName");
                String te = (String)request.getParameter("txtTel");
                String ag = (String)request.getParameter("txtAge");
                String bi = (String)request.getParameter("txtBirthday");
 
                db_st.setString(1,na);
                db_st.setString(2,te);
                db_st.setString(3,ag);
                db_st.setString(4,bi);
                db_st.setString(5,id);
                
                int update_rows ;
                update_rows = db_st.executeUpdate();
                System.out.println(update_rows);
                
                db_st=db_con.prepareStatement("select * from profiles");
                db_data=db_st.executeQuery();
                while(db_data.next()){
                System.out.print(db_data.getString("profilesID"));
                System.out.print(db_data.getString("name"));
                System.out.print(db_data.getString("tel"));
                System.out.print(db_data.getString("age"));
                System.out.println(db_data.getString("birthday"));
                }
                
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
