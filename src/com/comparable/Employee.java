package com.comparable;

public class Employee implements Comparable<Employee> {

    private int empId;
    private String name;
    private int salary;

    public Employee(int empId, String name, int salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

   /* @Override
    public int compareTo(Employee employee) {
        return this.name.compareTo(employee.getName());
    }*/

    @Override
    public int compareTo(Employee employee){
        if (salary==employee.salary)
            return 0;
        else if (salary > employee.getSalary())
            return 1;
        else
            return -1;
    }
}
