package com.designpattern.prototypedesign;

public class MainClient {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("creating object using prototype design pattern ");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("123.33.5.5");
        networkConnection.loadImportantData();
        // we want new object of network connection

        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();

            System.out.println(networkConnection);

            networkConnection.getList().remove(1);

            System.out.println(networkConnection);
            System.out.println(networkConnection2);
            System.out.println(networkConnection3);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
