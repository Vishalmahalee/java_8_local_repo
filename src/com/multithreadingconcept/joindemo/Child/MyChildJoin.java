package com.multithreadingconcept.joindemo.Child;

public class MyChildJoin extends Thread{

    public void run(){
        for (int i=0 ;i<5 ; i++){

            System.out.println("Swetal thread");

            try{
                Thread.sleep(1000);

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
