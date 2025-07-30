package com.learnlambda;

public class Main{
    public static void main(String[] args) {

        System.out.println("My system is start....");

        /* create seprate class and implement this interface
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.sayHello(); */


        //Anonymous class for implementing interface

        MyInterface anonymousClass= new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("this my first anonymous class");

            }
        };

        MyInterface in = new MyInterface() {
            @Override
            public void sayHello() {

            }
        };

        anonymousClass.sayHello();

         //By using our functional interface with the help of lambda

        MyInterface  myInterface = () -> {

            System.out.println("I am using first time interface ");
        };
        myInterface.sayHello();

        //By removing the curly bracket

        MyInterface i2= ()-> System.out.println("I am using second time interface ");
        i2.sayHello();


        SumInterface sumInterface= (a,b)->a + b;

        System.out.println(sumInterface.sum(12,30));
        System.out.println(sumInterface.sum(34,50));

        LengthInterface lengthInterface = str->str.length();

        System.out.println("the give string length is  "+lengthInterface.grtLength("Vishal Mahale"));

    }

}
