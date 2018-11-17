package com.krishna.javaexample.aggregation;

import java.util.List;

public class Department {
    private String name;
    // Associates the Department class to the student class
    private List<Student> students;
    
    public Department(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}