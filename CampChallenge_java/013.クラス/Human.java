
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author onishiharuka
 */
/*openというabstractな公開メソッドを用意してください。
setCardというArrayListを引数とした、abstractな公開メソッドを用意してください。
checkSumというabstractな公開メソッドを用意してください。
myCardsというArrayListの変数を用意してください。*/

public abstract class Human {
    public ArrayList<Integer> myCards = new  ArrayList<Integer>();
    abstract public int open();
    abstract public void setCard(ArrayList<Integer> x);
    abstract public boolean checkSum();
}