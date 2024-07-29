package com.edtech.student;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository {
    private final Map<String, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student getStudent(String id) {
        return students.get(id);
    }
}
