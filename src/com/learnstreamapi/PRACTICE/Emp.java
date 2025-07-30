package com.learnstreamapi.PRACTICE;

import java.time.LocalDate;

public class Emp {
    private String name;
    private String gender;  // "Male" or "Female"
    private int age;
    private LocalDate birth;
    private int salary;

    public Emp(String name, String gender, int age, LocalDate birth, int salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.birth = birth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", salary=" + salary +
                '}';
    }
}
