package com.oops.OOps_1;

public class OOP_1_garbage_coll {
    public static void main(String[] args) {

        A obj;
        for (int i = 0; i <100000000 ; i++) {
            obj=new A("Random");

        }

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
