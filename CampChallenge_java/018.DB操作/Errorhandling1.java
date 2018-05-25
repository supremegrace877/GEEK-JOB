import static java.lang.System.out;
import java.sql.*;

public class Errorhandling1 {
    public static void main(String[] args) throws SQLException{
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        db_con = DriverManager.getConnection(
        "jdbc:mysql://localhost:8889/Challenge_db", "haruka", "haruka72006");
    
        
        db_con.close();
        
        out.print("開いて閉じた");
        } catch (SQLException e_sql){
            System.out.println("接続時にエラーが発生しました："+e_sql.toString());
        }catch(Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        
        }finally{
            System.out.println("finallyが実行されました");
            if(db_con!=null){
                try{
                    db_con.close();
                }catch(SQLException e){
                    
                }
            }
        }
    
    }
    
}
