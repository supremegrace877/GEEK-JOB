
import java.nio.charset.Charset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author onishiharuka
 */
/*自分の氏名について，バイト数と文字数を取得してください。また，それぞれの値を画面に表示してください。*/

public class Baitosuu {

    public static void main(String... args) {
        System.out.println(getByteLength("大西はるか", Charset.forName("UTF-8")));
        String word = "大西はるか";
        System.out.println(word.length());
    }

    public static int getByteLength(String string, Charset charset) {
        return string.getBytes(charset).length;
       
        
    }
    }
}
