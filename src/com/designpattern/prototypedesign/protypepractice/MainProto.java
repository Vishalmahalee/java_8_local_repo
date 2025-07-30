package com.designpattern.prototypedesign.protypepractice;

public class MainProto {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        System.out.println("creating object using prototype design pattern ");

        NetWorkCon netWorkCon = new NetWorkCon();
        netWorkCon.setIpAdd("123.23.34.0");
        netWorkCon.loadImportantData();
        // we want new object of network connection
        NetWorkCon netWorkCon1 = (NetWorkCon) netWorkCon.clone();
        NetWorkCon netWorkCon2 = (NetWorkCon) netWorkCon.clone();

        System.out.println(netWorkCon);

        netWorkCon.getDomains().remove(0);

        System.out.println(netWorkCon);
        System.out.println(netWorkCon1);
        System.out.println(netWorkCon2);
    }

}
