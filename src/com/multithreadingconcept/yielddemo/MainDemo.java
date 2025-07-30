package com.multithreadingconcept.yielddemo;

public class MainDemo {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();

        myThread.join();

        for (int i=0 ;i<5 ;i++){
            System.out.println("main thread");
        }
    }
}
