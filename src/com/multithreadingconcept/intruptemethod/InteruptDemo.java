package com.multithreadingconcept.intruptemethod;

public class InteruptDemo extends Thread {

    public void run() {

       /* try {
            for (int i = 0; i < 5; i++) {
                System.out.println("I am Lazy thread");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Lazy thread is interrupted");
        }
    }*/

        for (int i = 0; i < 5; i++) {
            System.out.println("I am Lazy thread");
        }
    }
}
