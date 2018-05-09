/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author onishiharuka
 */
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/*2016年11月4日 10時0分0秒」の情報を持つタイムスタンプ（ミリ秒）を生成し，画面に表示してください。
その後，さらにこの情報を「2016-11-04 10:00:00」の形式で画面に表示してください。*/
public class timestamp2 {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(2016, 10, 4, 10, 0, 0);
        Date d = new Date();
        d=c.getTime();
        // タイムスタンプ表示
        System.out.println(d.getTime());
        
        // SimpleDateFormat作成
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Date取得
        // Date day = sdf.format("2017/10/11 12:31:50");
        System.out.print(sdf.format(d));

    }
}

