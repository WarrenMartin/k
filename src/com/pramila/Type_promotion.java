package com.pramila;

public class Type_promotion {
    public static void main(String[] args) {


                byte b = 42;
                char c = 'a';
                short s = 1024;
                int i = 1234567;
                float f = 123.67f;
                double d = .1234;
                double result = (f * b) + (i / c) - (d * s);
                System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
                System.out.println("result = " + result);


    }
}
