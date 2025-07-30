package com.multithreadingconcept.threadclass;

import com.multithreadingconcept.threadclass.MyThread;

public class ThreadDemo {

    public static void main(String[] args) {

        /*Thread.currentThread().setPriority(10);

        System.out.println(Thread.currentThread().getPriority());
*/
        MyThread myThread = new MyThread();
        myThread.setPriority(8);
        myThread.start();

        System.out.println(myThread.getPriority());
        for (int i =0 ;i<10; i++){
            System.out.println("Main Thread");
        }
    }
}
