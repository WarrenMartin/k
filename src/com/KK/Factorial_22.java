package com.KK;

import java.util.Scanner;

public class Factorial_22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Input");
        int n= input.nextInt();
        int ans=1;
        for (int i = 1; i <=n ; i++) {
                 ans=ans*i;

        }
        System.out.println("The Factorial of "+ans);


    }
}
