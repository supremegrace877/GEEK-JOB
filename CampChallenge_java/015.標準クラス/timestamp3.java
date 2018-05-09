
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author onishiharuka
 */
//2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）を表示してください。

public class timestamp3 {
        public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(2015, 0, 1, 0, 0, 0);
        Date d = new Date();
        d=c.getTime();
        
        Calendar e = Calendar.getInstance();
        e.set(2015, 11, 31, 23, 59, 59);
        Date f = new Date();
        f=e.getTime();
        
        // タイムスタンプ表示
        System.out.println((f.getTime())-(d.getTime()));
        }
}
  
