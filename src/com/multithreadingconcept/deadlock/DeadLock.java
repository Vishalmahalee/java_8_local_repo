package com.multithreadingconcept.deadlock;

public class DeadLock extends Thread{

    A a= new A();
    B b= new B();

    public void m1(){
        this.start();
        a.d1(b);       // this line executed by main thread
    }
    public void run(){
        b.d2(a);      // this line executed by child thread
    }

    public static void main(String[] args) {

        DeadLock deadLock = new DeadLock();
        deadLock.m1();
    }
}
