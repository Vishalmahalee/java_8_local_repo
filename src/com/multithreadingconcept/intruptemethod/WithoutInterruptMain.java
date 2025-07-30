package com.multithreadingconcept.intruptemethod;

public class WithoutInterruptMain {
    public static void main(String[] args) {
        WithoutInterrupt t= new WithoutInterrupt();
        t.start();
        t.interrupt();

        System.out.println("End of main thread");
    }
}
