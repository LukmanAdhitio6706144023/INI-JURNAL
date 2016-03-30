/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Praktikan
 */
public class Fibenoci_Lukman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a=0,b=1,hasil=0,c;
         Scanner input = new Scanner (System.in);
         System.out.print ("Masukan Deret Fibonacci  : ");
           c = input.nextInt ();
           for(int i=1; i<=c; i++){            
         a=b;
         b=hasil;
         hasil=a+b;
         System.out.print(hasil+" ");
        }
    } 
}
