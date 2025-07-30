package com.designpattern.builderdesign;

public class User {

    private final String userId;
    private final String userName;
    private final String userEmailId;


    private User(UserBuilder builder){

        this.userId= builder.userEmailId;
        this.userName= builder.userName;
        this.userEmailId= builder.userEmailId;

    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    @Override
    public String toString() {
        return "UserPattern{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmailId='" + userEmailId + '\'' +
                '}';
    }

    // create inner class for create object

    public static class UserBuilder{
        private  String userName;
        private  String userId;
        private  String userEmailId;

        public UserBuilder(){

        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserEmailId(String userEmailId) {
            this.userEmailId = userEmailId;
            return this;
        }


        /*
        1. it is used to create the user object
           2. The build method is called on the UserBuilder object,
           which invokes the private constructor of UserPattern and passes the UserBuilder object to it.
        */
        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
