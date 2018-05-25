import java.sql.*;
public class Setuzoku {
    public static void main(String[] args){
        Connection db_con = null;
        PreparedStatement db_st = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db","haruka","haruka72006");
            db_st = db_con.prepareStatement("INSERT INTO profiles(profilesID,name,tel,age,birthday)VALUES(?,?,?,?,?)");
            db_st.setInt(1,3);
            db_st.setString(2,"大西　はるか");
            db_st.setString(3,"080-1889-4848");
            db_st.setInt(4,21);
            Date sql_date = Date.valueOf("1996-07-07");
            db_st.setDate(5,sql_date);
            
            db_st.executeUpdate();
            db_con.close();
            
        }catch(Exception e){
            System.out.println("接続時にエラーが発生しました:"+e.toString());
        
        }finally{
            try{
                db_con.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

}                                       

