package com.designpattern.prototypedesign;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String importantData;

    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public List<String> getList() {
        return domains;
    }

    public void setList(List<String> list) {
        this.domains = list;
    }

    public void loadImportantData() throws InterruptedException {
        this.importantData="Very very important data";
        domains.add("www.google.com");
        domains.add("www.learnedjava.com");
        domains.add("www.greeksforgreeks.com");
        domains.add("www.facebook.com");

        Thread.sleep(5000);
        // it will take 5 minute
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", Domains='" + domains + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
