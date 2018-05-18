package Filesousa;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Filekakidasi {
    public static void main(String[] args){
        
        try {
            File fp=new File("test.txt");
            FileWriter fw=new FileWriter(fp,true);
            fw.write("大西はるかです。北海道出身です。よろしくお願いします。");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Filekakidasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
