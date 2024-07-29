package com.edtech.classroom;

import com.edtech.util.Logger;

public class ClassroomManager {
    private final ClassroomRepository repository;

    public ClassroomManager() {
        repository = new ClassroomRepository();
    }

    public void addClassroom(String name) {
        if (repository.getClassroom(name) == null) {
            Classroom classroom = new Classroom(name);
            repository.addClassroom(classroom);
            Logger.log("Classroom " + name + " has been created.");
        } else {
            Logger.log("Classroom " + name + " already exists.");
        }
    }
}
