package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MainComparable {

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(101, "ram", 9000));
        empList.add(new Employee(102, "ashok", 3000));
        empList.add(new Employee(103, "ajay", 8000));

        Collections.sort(empList);

        for (Employee sortedList:empList){

            System.out.println("Id : "+ sortedList.getEmpId()  +"  name : "+sortedList.getName()+"       salary :"+sortedList.getSalary());
        }

    }
}
