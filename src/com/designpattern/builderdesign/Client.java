package com.designpattern.builderdesign;

public class Client {
    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setUserId("Vishal@123")
                .setUserName("Vis@0707")
                .setUserEmailId("vishalmahale@77gmail.com")
                .build();

        System.out.println(user);
    }
}
