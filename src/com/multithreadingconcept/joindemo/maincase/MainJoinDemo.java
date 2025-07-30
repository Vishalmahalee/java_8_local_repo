package com.multithreadingconcept.joindemo.maincase;

public class MainJoinDemo {

    public static void main(String[] args) throws InterruptedException {
        MyMainJoin.mt=Thread.currentThread();

        MyMainJoin t =new MyMainJoin();
        t.start();
        for (int i =0 ; i< 5 ; i++ ){
            System.out.println("Main Thread");

            Thread.sleep(1000);
        }
    }
}
