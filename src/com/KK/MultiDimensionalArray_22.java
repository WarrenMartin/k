package com.KK;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArray_22 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>  list=new ArrayList<>(); //Created Two Dimensionally Array
        Scanner input=new Scanner(System.in);
        int in =input.nextInt();

        //Intialising Array List as of
        //int[][] arr=new int[3][];
        for (int i = 0; i <3 ; i++) {
            list.add(new ArrayList<>());
        }

        //Adding elements from KeyBoards
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                list.get(i).add(input.nextInt());
            }

        }
        System.out.println(list);
    }
}
