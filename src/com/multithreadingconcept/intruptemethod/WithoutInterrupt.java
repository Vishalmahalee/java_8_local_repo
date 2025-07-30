package com.multithreadingconcept.intruptemethod;

public class WithoutInterrupt extends Thread {

    public void run(){

        for (int i=0;i<1000;i++){
            System.out.println("I am Lazy Thread- "+i);
        }

        System.out.println("I want to sleep");

        try {
            Thread.sleep(1000);

        }catch (InterruptedException e){
            System.out.println("I got interrupted Exception");
        }
    }
}
