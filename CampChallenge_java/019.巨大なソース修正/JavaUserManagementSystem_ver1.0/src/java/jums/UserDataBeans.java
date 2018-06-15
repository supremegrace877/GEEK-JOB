package jums;
//  ①直列化可能
import java.io.Serializable;
//  ②パッケージに所属しpublicなクラス
public class UserDataBeans implements Serializable {
//  ④フィールドはカプセル化されている
    private String name ="";
    private String year = "";
    private String month = "";
    private String day = "";
    private String type = "";
    private String tell = "";
    private String comment = "";
//  ③publicで引数なしコンストラクタを持つ
    public UserDataBeans() {
    }
//  ⑤getter/setterを持つ
    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}
    public String getYear() {return this.year;}
    public void setYear(String year) {this.year = year;}
    public String getMonth() {return this.month;}
    public void setMonth(String month) {this.month = month;}
    public String getDay() {return this.day;}
    public void setDay(String day) {this.day = day;}
    public String getType(){return this.type;}
    public void setType(String type){this.type = type;}
    public String getTell(){return tell;}
    public void setTell(String tell){this.tell = tell;}
    public String getComment(){return comment;}
    public void setComment(String comment){this.comment = comment;}
}
