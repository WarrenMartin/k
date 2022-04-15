package com.KK;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Take input from the user

        char op = input.next().trim().charAt(0);

        int ans = 0;
        while (true){

            if (op == '+' || op == '-' || op == '*' || op == '/') {
                //input Two numbers
                System.out.println("ENTER OPERATION");
            }
                System.out.println("Enter Two Numbers");
               int num1= input.nextInt();
               int num2=input.nextInt();

               if(op=='+'){
                   ans=num1+num2;
               }
               if(op=='-'){
                   ans=num1-num2;
               }
               if(op=='*'){
                   ans=num1*num2;
               }
               if(num2!=0){
                   if(op=='/'){
                       ans=num1/num2;
                   }
               }
               else if(op=='X' || op=='x'){
                   break;
               }
                System.out.println("The Answer is"+ans);







        }
    }
}

