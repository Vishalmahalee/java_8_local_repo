package com.designpattern.prototypedesign.protypepractice;

import java.util.ArrayList;
import java.util.List;

public class NetWorkCon implements Cloneable{

    public String ipAdd;
    public String importantData;
    private List<String> domains = new ArrayList<>();

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getIpAdd() {
        return ipAdd;
    }

    public void setIpAdd(String ipAdd) {
        this.ipAdd = ipAdd;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadImportantData() throws InterruptedException {
        this.importantData="Very very important data";
        domains.add("www.google.com");
        domains.add("www.learnedjava.com");
        domains.add("www.greeksforgreeks.com");
        domains.add("www.facebook.com");

        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "NetWorkCon{" +
                "ipAdd='" + ipAdd + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
