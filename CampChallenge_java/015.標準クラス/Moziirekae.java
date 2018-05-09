/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author onishiharuka
 */
/*文字列型の変数を宣言して，"きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます" をその値としてください。 
宣言した変数について，「I」を「い」に，「U」を「う」に置換した文字列を表示してください。*/
public class Moziirekae {
    public static void main(String[] args) {
        String word = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        // 文字の置換 
        String word2 = word.replace("I", "い");
         
        System.out.println(word2.replace("U", "う"));
    }
}
