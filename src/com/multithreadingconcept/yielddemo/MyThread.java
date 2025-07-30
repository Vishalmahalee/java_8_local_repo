package com.multithreadingconcept.yielddemo;

public class MyThread extends Thread{

    public void run(){

        for (int i =0 ; i<5 ;i++){

            System.out.println("child thread");
            Thread.yield();
        }
    }
}
