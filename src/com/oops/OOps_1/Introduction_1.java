package com.oops.OOps_1;

import static com.oops.OOps_2.Message.message;

public class Introduction_1 {
    public static void main(String[] args) {
        student stu1=new student();
        System.out.println(stu1.name); //This would  print null but now there is a constructor so it wil print mar
        stu1.name="War";
        System.out.println(stu1.name);
        student stu2=new student();
        System.out.println(stu2.name);

       //calling via using arguments
        student stu3=new student(19,"Paramatised constructor",87.9f); //could set parameter bcz using second constructor
        System.out.println(stu3.name);

        //taking value from other object
        student stu4=new student(stu3); //so stu4 is replaced by other that is stu3
        System.out.println(stu4.name); //here the name is paramatised
        System.out.println(stu4.percentage);
        message(); //This can be imported from other sub package also
        //here it is imported from oops 2 which is other package

    }
    static class student{
        int rno;
        String name;
        float percentage;
        student(){      //constructor
            //when you call constructor with no parametered arguemnts it will call this
            this.name="mar";    //this will be repaced by class name stu2
            this.rno=18;
            this.percentage=84.5f;
            //if this keyword was not say for name it is not there then it will select a default value for name

        }

        //Student arpit=new student(17,"arpit",89.73f);
        //here this keyword will be replaced with arpit
        student(int rno,String naam,float marks){ //second constructor using parameter
            //note that whn you call  constructor with 3 values it will call this
            this.rno=rno;
            this.name=naam;
            this.percentage=marks;
            }
            student (student other){
            this.name=other.name;
            this.rno=other.rno;
            this.percentage=other.percentage;
            }



    }
}
