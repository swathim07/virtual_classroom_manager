package com.edtech.student;

import com.edtech.classroom.Classroom;
import com.edtech.classroom.ClassroomRepository;
import com.edtech.util.Logger;

public class StudentManager {
    private final StudentRepository studentRepository;
    private final ClassroomRepository classroomRepository;

    public StudentManager() {
        studentRepository = new StudentRepository();
        classroomRepository = new ClassroomRepository();
    }

    public void addStudent(String details) {
        String[] tokens = details.split(" ", 2);
        String studentId = tokens[0];
        String className = tokens[1];

        Classroom classroom = classroomRepository.getClassroom(className);
        if (classroom == null) {
            Logger.log("Classroom " + className + " does not exist.");
            return;
        }

        Student student = new Student(studentId);
        studentRepository.addStudent(student);
        classroom.addStudent(studentId);
        Logger.log("Student " + studentId + " has been enrolled in " + className + ".");
    }
}
