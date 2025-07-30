package com.multithreadingconcept.runableInter;

public class MainRun {
    public static void main(String[] args) {

        MyRunnable r= new MyRunnable();
        Thread t1= new Thread();
        Thread t2 = new Thread(r);

       // t1.start();

        t1.run();

        t2.start();

        for(int i=0;i<5;i++)
        {
            System.out.println("main thread");
        }


        /*System.out.println(Thread.currentThread().getName());

        MyRunnable myRunDemo = new MyRunnable();

        Thread thread = new Thread(myRunDemo);

        System.out.println(thread.getName());

        Thread.currentThread().setName("MAIN THREAD");

        System.out.println(Thread.currentThread().getName());

        thread.start();

        thread.setPriority(10);

        System.out.println(thread.getPriority());

        System.out.println("This line is executed by  "+ Thread.currentThread().getName());*/



    }
}
