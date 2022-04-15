package com.KK;

import java.util.Scanner;

public class LeapYear_18 {
    public static void main(String[] args) {
        System.out.println("Enter A year");
        int n,ans=0;
        fun();


    }

    static void fun(){
        int n;
        Scanner input=new Scanner(System.in);
        n= input.nextInt();
        if(n>1000){
            if(n%4==0){
                System.out.println(n+" is a leap year");
            }
            else{
                System.out.println(n+" is not a leap year");
            }

        }
        else{
            System.out.println("Enter a valid year");
        }
    }
}
