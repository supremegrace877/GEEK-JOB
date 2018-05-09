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

public class timestamp {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(2016, 0, 1, 0, 0, 0);
        Date d = new Date();
        d=c.getTime();
        // タイムスタンプ表示
        System.out.println(d.getTime());

    }
}
