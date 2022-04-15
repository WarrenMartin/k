package com.KK;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestOfNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int l;

        System.out.println("Enter a Number1");
        int a=input.nextInt();

        System.out.println("Enter a Number1");
        int b =input.nextInt();

        System.out.println("Enter a Number1");
        int c=input.nextInt();

        if(a>b && a>c){
            l=a;
        }
        if(b>c){
            l=b;
        }
        else{
            l=c;
        }
        System.out.println(l);







    }
}
