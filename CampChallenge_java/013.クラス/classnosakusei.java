/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author onishiharuka
 */



public class classnosakusei {
    public static void main (String[] args){
    Human h=new Human();
    
//    h.name="haruka";
//    h.num=7;
    
    h.setHuman("haruka", 7);
    h.msd();
}
}
    
class Human{
    public String name;
    public int num;
    
    public void setHuman(String name2,int num2){
        this.name=name2;
        this.num=num2;
    }
    public void msd(){
    System.out.print("氏名：" + name+"、年齢："+num);
    
    
    
    }


}


