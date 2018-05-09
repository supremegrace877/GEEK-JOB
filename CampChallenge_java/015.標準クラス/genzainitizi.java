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
import java.text.SimpleDateFormat;

public class genzainitizi {
    public static void main (String[] args){
           Date now = new Date();
    // SimpleDateFormat作成
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");

    // Date取得
//    Date day = sdf.format("2017/10/11 12:31:50");
    System.out.print(sdf.format(now));
    }
}
