package com.KK;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;

        int i,t;
        System.out.println("Enter input");
        Scanner input = new Scanner(System.in);
        System.out.println(0);
        System.out.println(1);
        int n= input.nextInt();
        for(i=2;i<=n;i++){
           t=b;
           b=a+b;
           a=t;

        }
        System.out.println(b);


    }
}
