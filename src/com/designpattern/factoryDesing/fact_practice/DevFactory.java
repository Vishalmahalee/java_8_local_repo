package com.designpattern.factoryDesing.fact_practice;

import java.util.Optional;

public class DevFactory {

    public static Dev getDevObject(String message){

        if(message.trim().equalsIgnoreCase("ANDROID DEV")){
            return new AndDev();
        } else if (message.trim().equalsIgnoreCase("JAVA DEV")) {
            return new JavaDev();
        }else {
            return null;
        }
    }
}
