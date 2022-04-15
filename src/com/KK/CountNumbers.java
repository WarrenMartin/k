package com.KK;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        int n=155;
        //int rem=0;
        int count=0;
        while(n>0){
            if(n%10==5){
                count+=1;
            }
            n=n/10;


        }
        System.out.println(count);
    }

        }

