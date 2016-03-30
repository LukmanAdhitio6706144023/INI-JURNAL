package deret.fibonacci;

import java.util.Scanner;

public class DeretFibonacci {

    public static void main(String[] args) {
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
