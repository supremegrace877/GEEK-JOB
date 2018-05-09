/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author onishiharuka
 */
public class Mozisuusyutoku {
    /*部分的に文字を取得（substringメソッド）：
    * 部分的に文字を取得（以降全部）
　　変数 = String変数.substring(開始位置);*/
    public static void main(String[] args) {
       String address="supremegrace877@icloud.com";
        // @以降を取得 
        System.out.println(address.substring(16).length());
    }
}