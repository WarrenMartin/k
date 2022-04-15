package com.pramila;

public class AtoZ {
    public static void main(String[] args) {
        System.out.println("using character data-type");
        for (char i = 'a'; i <= 'n'; i++) {
            System.out.print(" "+i+"->"+""+(int)(i));
            //stem.out.print();

        }
        System.out.println();
        for (char i = 'q'; i <= 'z'; i++) {
            System.out.print(" "+i+"->"+""+(int)(i));
            //stem.out.print();

        }

        System.out.println();
        System.out.println("\n using int data-type");
        for (int i = 65; i <79 ; i++) {
            System.out.print(" "+(char)(i)+ "->" +i); //
        }
        System.out.println();


        for (int i = 79; i <91 ; i++) {
            System.out.print(" "+(char)(i)+ "->" +i); //
        }
    }

}
