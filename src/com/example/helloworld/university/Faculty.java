package com.example.helloworld.university;

import java.util.List;

public class Faculty {
    public final String name;
    private final List<Subject> subjects;
    public final List<Group> groups;

    public Faculty(String name, List<Subject> subjects, List<Group> groups) {
        this.name = name;
        this.subjects = subjects;
        this.groups = groups;
    }

    public void printAllStudents() {
        for (Group group : groups) {
            for (Student student : group.students) {
                System.out.println(student.name);
            }
        }
    }

    public void printAllStudentsByGroups() {
        for (Group group : groups) {
            System.out.println("* "+ group.number);
            for (Student student : group.students) {
                System.out.println(" - "+ student.name);
            }
        }
    }
}
