package com.learnstreamapi.Stream_Senario_Questions;

public class SortEmployeeSal {

    private int id ;
    private long salary;

    public SortEmployeeSal(int id, long salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SortEmployeeSal{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }
}
