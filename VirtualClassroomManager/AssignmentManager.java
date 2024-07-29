package com.edtech.assignment;

import com.edtech.classroom.Classroom;
import com.edtech.classroom.ClassroomRepository;
import com.edtech.student.StudentRepository;
import com.edtech.util.Logger;

public class AssignmentManager {
    private final AssignmentRepository assignmentRepository;
    private final ClassroomRepository classroomRepository;
    private final StudentRepository studentRepository;

    public AssignmentManager() {
        assignmentRepository = new AssignmentRepository();
        classroomRepository = new ClassroomRepository();
        studentRepository = new StudentRepository();
    }

    public void scheduleAssignment(String details) {
        String[] tokens = details.split(" ", 2);
        String className = tokens[0];
        String assignmentDetails = tokens[1];

        Classroom classroom = classroomRepository.getClassroom(className);
        if (classroom == null) {
            Logger.log("Classroom " + className + " does not exist.");
            return;
        }

        Assignment assignment = new Assignment(assignmentDetails);
        assignmentRepository.addAssignment(assignment);
        classroom.addAssignment(assignmentDetails);
        Logger.log("Assignment for " + className + " has been scheduled.");
    }

    public void submitAssignment(String details) {
        String[] tokens = details.split(" ", 3);
        String studentId = tokens[0];
        String className = tokens[1];
        String assignmentDetails = tokens[2];

        Classroom classroom = classroomRepository.getClassroom(className);
        if (classroom == null) {
            Logger.log("Classroom " + className + " does not exist.");
            return;
        }

        Student student = studentRepository.getStudent(studentId);
        if (student == null) {
            Logger.log("Student " + studentId + " does not exist.");
            return;
        }

        Assignment assignment = assignmentRepository.getAssignment(assignmentDetails);
        if (assignment == null) {
            Logger.log("Assignment does not exist.");
            return;
        }

        // Assuming we have a mechanism to track submissions
        Logger.log("Assignment submitted by Student " + studentId + " in " + className + ".");
    }
}
