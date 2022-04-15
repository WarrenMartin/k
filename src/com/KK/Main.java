package com.KK;

public class Main {
    public static void main(String[] args){
        int s=2000;
        if (s>1000){
            s+=1000;
        }
        else if(s>2000){
            s+=2000;
        }
        else{
            s+=500;
        }
        System.out.println(s);

    }
}
