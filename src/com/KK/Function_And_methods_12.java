package com.KK;

import java.util.Scanner;

public class Function_And_methods_12 {
    public static void main(String[] args) {
        while(true){
           // sum();
            int a=sum();
            System.out.println(a);
            //sum is writting the name of the function and sun() is calling the function

        }

    }
      static int sum(){ //as we are calling the function in public static so that why the function should be static
    //inside the sum() bracket you can pass parameter also.
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1=input.nextInt();
        System.out.println("Enter Number 2");
        int num2=input.nextInt();
        int ans=0;
        ans=num1+num2;
        return ans;
          ///System.out.println("The answer is "+ans);
    }

}
