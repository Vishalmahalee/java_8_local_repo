package com.multithreadingconcept.joindemo.maincase;

public class MyMainJoin extends Thread{

    public static Thread mt;

    public void run(){

        try{
            mt.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        for (int i=0 ;i<5 ;i++){
            System.out.println("child thread");
        }
    }
}
