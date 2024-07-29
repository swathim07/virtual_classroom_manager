package com.edtech.classroom;

import java.util.HashMap;
import java.util.Map;

public class ClassroomRepository {
    private final Map<String, Classroom> classrooms = new HashMap<>();

    public void addClassroom(Classroom classroom) {
        classrooms.put(classroom.getName(), classroom);
    }

    public Classroom getClassroom(String name) {
        return classrooms.get(name);
    }
}
