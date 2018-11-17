package com.krishna.javaexample.encapsulation;

/**
 * UserMain
 */
public class UserMain {

    public void runUser() {
        User user = new User();

        user.setName("Krishna");
        user.setAge(22);
        user.setGender("Female");
        user.setCity("Chicago");

        System.out.println("Name : " + user.getName());
        System.out.println("Age : " + user.getAge());
        System.out.println("Gender : " + user.getGender());
        System.out.println("City : " + user.getCity());
    }
}