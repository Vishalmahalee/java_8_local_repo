package com.designpattern.singletondesign;

public class LazySingleton {

    private static LazySingleton instance ;

    private LazySingleton(){

        if(instance != null){
            throw new RuntimeException("You trying to break singleton object");
        }

    }

    public static LazySingleton getInstance(){

        if (instance==null){

            synchronized (LazySingleton.class){
                if (instance==null){
                    instance= new LazySingleton();
                }
            }
        }
        return instance;
    }
}
