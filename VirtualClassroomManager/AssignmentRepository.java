package com.edtech.assignment;

import java.util.HashMap;
import java.util.Map;

public class AssignmentRepository {
    private final Map<String, Assignment> assignments = new HashMap<>();

    public void addAssignment(Assignment assignment) {
        assignments.put(assignment.getDetails(), assignment);
    }

    public Assignment getAssignment(String details) {
        return assignments.get(details);
    }
}
