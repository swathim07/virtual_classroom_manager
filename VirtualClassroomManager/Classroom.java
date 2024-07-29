package com.edtech.classroom;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final String name;
    private final List<String> students;
    private final List<String> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getStudents() {
        return students;
    }

    public List<String> getAssignments() {
        return assignments;
    }

    public void addStudent(String studentId) {
        students.add(studentId);
    }

    public void addAssignment(String assignmentDetails) {
        assignments.add(assignmentDetails);
    }
}
