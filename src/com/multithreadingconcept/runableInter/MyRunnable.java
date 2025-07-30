package com.multithreadingconcept.runableInter;

public class MyRunnable implements Runnable{


    @Override
    public void run() {
        for (int i=0;i<10 ;i++){

            Thread.currentThread().setName("CHILD THREAD");

            System.out.println("Print i Value "+i);
            try {
                Thread.sleep(200);
                System.out.println("This line is executed by  "+ Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
