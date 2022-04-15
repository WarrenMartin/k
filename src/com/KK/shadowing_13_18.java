package com.KK;

public class shadowing_13_18 {
   static int x=90;//higher level scope

    public static void main(String[] args) {
        System.out.println(""+x);
        int x=40;//lower level scope
        System.out.println(x);//will print 40 bcz variable with a higher level scope is hidden

        {
         //   int x=55; //will give you a error beacause intialised already in the main cope
            System.out.println("Inside Block Scope "+x);
            funny();
        }
        funny();


    }
    static void funny(){
        int x=90;
        System.out.println(x+" is in the funny function\n");
    }

}
