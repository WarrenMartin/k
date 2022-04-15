package com.oops.OOps_1;

import java.util.Arrays;

public class pr1 {
    public static void main(String[] args) {

        //object student array
    Student[] student=new Student[5];

    //just declaring
            //st1 object
        Student st1=new Student();

        System.out.println(st1.name);
        st1.name="War";
        //Another object with name warren2( parenthesis object)
        Student warren2=new Student(18,"war",98.7f);
        System.out.println("This Name is from Parenthesis constructor "+warren2.name);

        st1.change_name("shoe lover");//using change name function
        st1.greeting();
        System.out.println(st1.name);//the name is changed to shoe lover(second name)






    }

        //create a class
        //for every single Student

    static   class Student{
        int rno;
        String name;
        float marks;

        Student(){
            int rno=13;
            String name="war";
            float marks=94.5f;


        }
        //Declaring Function
       void change_name(String newName){
            name=newName;

       }
        void greeting(){
            System.out.println("Hello Greeting Fun "+this.name);
            //we use this.name cz
        }

        Student(int rnoo,String naam,float pur){    //The paranthesis this has a flexibility of putting whateer u want for new new obje
            this.rno=rnoo;
            this.name=naam;
            this.marks=pur;
        }
    }

}
