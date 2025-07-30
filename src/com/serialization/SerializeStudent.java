package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeStudent {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId("1");
        student.setName("vishal");
        student.setEmailId("vishalmahale350@gmail.com");

        try{

            FileOutputStream fios = new FileOutputStream("C:\\Users\\swapnil\\OneDrive\\Desktop\\Serial.text");
            ObjectOutputStream oos = new ObjectOutputStream(fios);
            oos.writeObject(student);
            fios.close();
            oos.close();
            System.out.println("Serialization is done...");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
