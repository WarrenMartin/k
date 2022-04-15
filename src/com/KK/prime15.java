package com.KK;

import java.util.Scanner;

public class prime15 {
    public static void main(String[] args) {
       //int i;
        System.out.println("Enter Number");
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int count=0;
        for (int i = 1; i <n ; i++) {
            if(n%i==0){
                count++;
            }



        }
        if(count==2){
            System.out.println("prime number found");
        }
        else{
            System.out.println("It is not prime number");
        }
    }


}
