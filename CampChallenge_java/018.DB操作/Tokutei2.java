import java.sql.*;
public class Tokutei2 {
    public static void main (String[] args){
        Connection db_con = null;
        PreparedStatement db_st=null;
        ResultSet db_data=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            db_con=DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST","haruka","haruka72006");
            db_st=db_con.prepareStatement("select * from profiles where name like'%茂%'");
            db_data=db_st.executeQuery();
            while(db_data.next()){
            System.out.print(db_data.getInt("profilesID"));
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
        } 
}
