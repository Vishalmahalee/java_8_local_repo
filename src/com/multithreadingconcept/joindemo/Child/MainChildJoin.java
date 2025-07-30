package com.multithreadingconcept.joindemo.Child;

public class MainChildJoin {
    public static void main(String[] args) throws InterruptedException {

        MyChildJoin t = new MyChildJoin();
        t.start();

        t.join(4000);

        for (int i=0; i<5 ;i++){
            System.out.println("Rama thread");
        }

    }
}
