package com.edtech.util;

import com.edtech.classroom.ClassroomManager;
import com.edtech.student.StudentManager;
import com.edtech.assignment.AssignmentManager;

public class CommandHandler {
    private final ClassroomManager classroomManager;
    private final StudentManager studentManager;
    private final AssignmentManager assignmentManager;

    public CommandHandler() {
        classroomManager = new ClassroomManager();
        studentManager = new StudentManager();
        assignmentManager = new AssignmentManager();
    }

    public void handleCommand(String input) {
        String[] tokens = input.split(" ", 2);
        String command = tokens[0];
        String details = tokens.length > 1 ? tokens[1] : "";

        switch (command) {
            case "add_classroom":
                classroomManager.addClassroom(details);
                break;
            case "add_student":
                studentManager.addStudent(details);
                break;
            case "schedule_assignment":
                assignmentManager.scheduleAssignment(details);
                break;
            case "submit_assignment":
                assignmentManager.submitAssignment(details);
                break;
            default:
                Logger.log("Invalid command");
        }
    }
}
