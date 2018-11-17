package com.krishna.javaexample.aggregation;

import java.util.List;

/**
 * Institute
 */
public class Institute {
    private String instituteName;
    private List<Department> departments;

    public Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }
    
    public int getTotalStudentsInInstitute() {
        int noOfStudents = 0;
        List<Student> students;

        for (Department dept : departments) {
            students = dept.getStudents();

            for (Student s : students) {
                noOfStudents++;
            }
        }

        return noOfStudents;
    }   
}