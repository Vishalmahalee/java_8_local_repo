package com.designpattern.singletondesign.practice;

public class LazyThreadInsta {

    private static LazyThreadInsta lazyThreadInsta;

    private LazyThreadInsta(){

    }

    public static LazyThreadInsta createSingletonObject(){

        if (lazyThreadInsta==null){

            synchronized (LazyThreadInsta.class){
                if (lazyThreadInsta==null){
                    lazyThreadInsta= new LazyThreadInsta();
                }
            }
        }
        return lazyThreadInsta;
    }
}
