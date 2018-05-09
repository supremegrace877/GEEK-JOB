/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author onishiharuka
 */
public class classnokeisyo {
    public static void main (String [] args){
        classnokeisyo2 c=new classnokeisyo2();
        c.tuika();
        c.msd();
        
    }
}




class classnokeisyo2 extends Human{
    public void tuika (){
    this.name="";
    this.num=0;
    }

}