package com.multithreadingconcept.intruptemethod;

public class MainInterrupt {
    public static void main(String[] args) {

        InteruptDemo t = new InteruptDemo();
        t.start();
        t.interrupt();

        System.out.println("end of the main thread");
    }
}
