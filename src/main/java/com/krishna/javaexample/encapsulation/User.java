package com.krishna.javaexample.encapsulation;

/**
 * User
 */
public class User {
    private String name;
    private int age; 
    private String gender;
    private String city;

    public User() {}
    
    public User(String name, int age, String gender, String city) 
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return ("{ name : " + name + " | age : " + age + " | gender : " + gender + " | city : " + city + " }");
    }
}