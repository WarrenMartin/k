package com.KK;

import java.io.EOFException;

public class Reverse {
    public static void main(String[] args){
        int num=123;
        int ans=0;
        int rem=0;
        while(num>0){
            rem=num%10;
            ans=ans*10+rem;
            num=num/10;

        }
        System.out.println(ans);

        }







    }


