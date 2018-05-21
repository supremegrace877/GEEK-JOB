package Filesousa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hyozyun_class {

    public static void main(String[] args) {
        Date d = new Date();
        Date e = new Date();
        System.out.println(d);
        try {
            File fp = new File("API.txt");
            FileWriter fw = new FileWriter(fp);
            fw.write("処理開始時刻:");
            fw.write(d.toString());
            fw.write("処理内容:Map");
            Map<String, String> map = new HashMap<>();
            map.put("item1", "apple");
            map.put("item2", "orange");
            map.put("item3", "melon");
            fw.write(map.toString());
            fw.write("処理終了時刻:");
            fw.write(e.toString());
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Filekakidasi.class.getName()).log(Level.SEVERE, null, ex);
        }
//        1. 処理の内容（例：文字列の置換） 
//2. 処理を開始する旨と，その時刻（例：2000-01-01 12:00 開始） 
//3. 処理を終了する旨と，その時刻（例：2000-04-04 11:00 終了） 
//    

    }

    private static char[] toString(Map<String, String> map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
