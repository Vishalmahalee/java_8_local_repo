package com.multithreadingconcept.threadcommunication;

public class ThreadA {

    public static void main(String[] args) throws InterruptedException {

        ThreadB b = new ThreadB();
        b.start();
        Thread.sleep(10000);

        synchronized (b){

            System.out.println("Main thread trying to call wait() method ");// step->1
            b.wait(10000);

            System.out.println("main thread getting notification");  // step->4

            System.out.println(b.totol);
        }
    }
}
