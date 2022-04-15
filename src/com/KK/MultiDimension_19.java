package com.KK;

import java.util.Scanner;

public class MultiDimension_19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] arr=new int[3][2];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = input.nextInt();

            }


        }

        for(int row=0;row< arr.length;row++){
            for (int column = 0; column <arr[row].length ; column++) {

                System.out.print(arr[row][column]);
            }
        }


        }
        
    }

