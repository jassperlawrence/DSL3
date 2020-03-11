/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L03Q02;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author Jassper
 */
public class readWrite {
    
    public static void main(String[] args) {
        try {
            //Read from file
            Scanner in = new Scanner(new FileInputStream("wordsn2.txt"));
            while(in.hasNext()){
                a(in.next());
                System.out.println();
            }
            in.close();
        } catch (Exception e) {
        }
    }
    //recursive method that returns opposite of a word
    public static void  a(String b){
        if(b.length()<=1||b==null){
            System.out.print(b);
        }
        else {
            //print reverse 
            System.out.print(b.charAt(b.length()-1));
            //call the method again by returning the same string with modified length
            a(b.substring(0, b.length()-1));
        }
        
    }
    
}
