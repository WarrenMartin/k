package com.oops.OOps_2;       //this are basically companies url in opposite direction// just a road map of where does this file exist

import org.w3c.dom.ls.LSOutput;

public class OOP_2 {
    public static void main(String[] args) {
        A obj =new A("war");
        System.out.println(obj); //This will show some hash value
        //we want that when we print any obj of type A then it should print out something for that we need overriding
        //packages r boxes for classes used to keep class name in compartments
        //We cannot have two file name in one package we need to put them in a different package





    }



    static class A{
        final int num=10;
        String name;
        public A(String name){
            this.name=name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object Destroyed");
        }

    }

}
