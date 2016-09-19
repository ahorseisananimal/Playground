package com.example.helloworld.university;

import java.util.List;

public class Group {
    public final String number;
    public final List<Student> students;

    public Group(String number, List<Student> students) {

        this.number = number;
        this.students = students;
    }
}
