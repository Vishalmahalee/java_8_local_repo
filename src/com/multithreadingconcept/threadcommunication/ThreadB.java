package com.multithreadingconcept.threadcommunication;

public class ThreadB extends Thread{

    int totol=0;

    public void run(){

        synchronized (this){

            System.out.println("child thread start the calculation"); //step -> 2

            for (int i =0 ;i<100;i++){

                totol=totol+i;
            }

            System.out.println("child thread trying to give notification call"); //step->3
        }
    }
}
