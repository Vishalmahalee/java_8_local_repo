package com.multithreadingconcept.synchronization;

public class MyThread extends Thread{

    private Display d;

    private String name;

    MyThread(Display d,String name){
        this.d=d;
        this.name=name;
    }

    public void run(){
        try {
            d.wish(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
