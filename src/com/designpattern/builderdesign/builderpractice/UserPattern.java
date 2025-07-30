package com.designpattern.builderdesign.builderpractice;

public class UserPattern {

    public final int empId;
    public final String empName;

    public final String email;

    private UserPattern(UserBuilder userBuilder){
        this.empId=userBuilder.empId;
        this.empName=userBuilder.empName;
        this.email=userBuilder.email;

    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "UserPattern{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class UserBuilder {
        public  int empId;
        public  String empName;
        public  String email;

        public UserBuilder setEmpId(int empId) {
            this.empId = empId;
            return this;
        }

        public UserBuilder setEmpName(String empName) {
            this.empName = empName;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserPattern build(){
            UserPattern userBuilder = new UserPattern(this);
            return userBuilder;
        }
    }
}
