package Filesousa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Fileyomidasi {
    public static void main(String[] args) throws IOException{
        File fp=new File("test.txt");
        FileReader fr = new FileReader(fp);
        // BufferedReader作成
        BufferedReader br = new BufferedReader(fr);
        // 1行読み出し
        System.out.print(br.readLine());

        br.close();
  }
    
    
    
    
    }
    
}
