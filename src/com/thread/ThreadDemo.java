package com.thread;

public class ThreadDemo {

    public static void main(String[] args) {

        Runnable thread1 = ()->{

            for (int i=0;i<=10;i++){
                System.out.println("Value of i is  "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread = new Thread(thread1);
        thread.setName("john");
        System.out.println(thread.getName());
        thread.start();

        Runnable thread2=()->{
            for (int i=0;i<=10;i++){
                System.out.println(i*2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread3 = new Thread(thread2);
        thread3.setName("Vicky");
        System.out.println(thread3.getName());
        thread3.start();

    }
}
