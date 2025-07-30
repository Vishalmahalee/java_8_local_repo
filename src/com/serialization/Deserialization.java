package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {

        try{
            FileInputStream fis= new FileInputStream("C:\\Users\\swapnil\\OneDrive\\Desktop\\Serial.text");

            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();

            Student s = (Student) obj;// convert to student
            System.out.println(s.getId());
            System.out.println(s.getName());
            System.out.println(s.getEmailId());

            fis.close();
            ois.close();

        }catch (Exception  e){
            e.printStackTrace();
        }
    }
}
