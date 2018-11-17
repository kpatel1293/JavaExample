package com.krishna.javaexample.aggregation;

import java.util.ArrayList;
import java.util.List;

// Aggregation
/*
 * has-a relationship
 * It is a unidirectional association i.e. a one way relationship. 
 * For example, department can have students but vice versa is not possible and thus unidirectional in nature.
 * both the entries can survive individually 
 */

public class AggregationMain 
{
    public void RunAggregation() {
        Student studentOne = new Student("Krishna Patel", 1, "CSE");
        Student studentTwo = new Student("Priya", 2, "CSE");
        Student studentThree = new Student("John", 1, "EE");
        Student studentFour = new Student("Rahul", 2, "EE");

        // List of Students for CSE 
        List<Student> cse_students = new ArrayList<Student>();
        cse_students.add(studentOne);
        cse_students.add(studentTwo);

        // List of Students for EE
        List<Student> ee_students = new ArrayList<Student>();
        ee_students.add(studentThree);
        ee_students.add(studentFour);

        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);

        List<Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);

        // Instance of Institute
        Institute institute = new Institute("BITS", departments);

        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudentsInInstitute());
    }
}