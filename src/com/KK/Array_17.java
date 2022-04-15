package com.KK;

import java.util.Arrays;
import java.util.Scanner;

import static com.oops.OOps_2.Message.message;

public class Array_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[]=new int[5];

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=input.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        message(); //This is imported from com.oops.oops2

    }

}
