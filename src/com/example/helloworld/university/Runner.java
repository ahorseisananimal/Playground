package com.example.helloworld.university;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    private static ArrayList<Faculty> faculties;

    public static void main(String[] args) {
        List<Subject> geologySubjects = new ArrayList<>();
        geologySubjects.add(new Subject("Petrology", new Teacher("Glebov")));
        geologySubjects.add(new Subject("Litology", new Teacher("Fesenko")));
        List<Group> geologyGroups = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivanov GP"));
        students.add(new Student("Petrov NV"));
        students.add(new Student("Sidorov PF"));
        students.add(new Student("Semenov OP"));
        students.add(new Student("Dolgushina AO"));
        geologyGroups.add(new Group("GG1", students));

        students = new ArrayList<>();
        students.add(new Student("Osipov OO"));
        students.add(new Student("Glotov DA"));
        students.add(new Student("Ivanov GR"));
        students.add(new Student("Vashenko OP"));
        students.add(new Student("Heresschuk IK"));
        geologyGroups.add(new Group("GG2", students));

        Faculty geology = new Faculty("Geology", geologySubjects, geologyGroups);
        faculties = new ArrayList<>();
        faculties.add(geology);

        List<Subject> biologySubjects = new ArrayList<>();
        biologySubjects.add(new Subject("Botanic", new Teacher("Herov")));
        biologySubjects.add(new Subject("Chemistry", new Teacher("Pisunov")));
        List<Group> biologyGroups = new ArrayList<>();
        students = new ArrayList<>();
        students.add(new Student("Svetlov GP"));
        students.add(new Student("Gerfd NV"));
        students.add(new Student("Kljl PF"));
        students.add(new Student("Ivanov OP"));
        students.add(new Student("JLJkj AO"));
        biologyGroups.add(new Group("BG1", students));

        students = new ArrayList<>();
        students.add(new Student("Klkjglk OO"));
        students.add(new Student("Wkljlkjlk DA"));
        students.add(new Student("JHkjhjhkj GR"));
        biologyGroups.add(new Group("BG2", students));

        Faculty biology = new Faculty("Biology", biologySubjects, biologyGroups);
        faculties.add(biology);


        // printAllStudents();
        // printAllStudentsByFacultiesAndGroups();

        printCountOfStudentsWithSurnameByFaculty("Svetlov");
        printCountOfStudentsWithSurnameByFaculty("Ivanov");

    }

    private static void printCountOfStudentsWithSurnameByFaculty(String surname) {
        for (Faculty faculty : faculties) {
            int count = 0;
            for (Group group : faculty.groups) {
                for (Student student : group.students) {
                    if (student.name.contains(surname)) {
                        count++;
                    }
                }
            }
            System.out.println(faculty.name +" counting " + count);
        }


    }

    private static void printAllStudentsByFacultiesAndGroups() {
        for (Faculty faculty : faculties) {
            System.out.println(faculty.name);
            faculty.printAllStudentsByGroups();
        }
    }

    private static void printAllStudents() {
        for (Faculty faculty : faculties) {
            faculty.printAllStudents();
        }
    }
}
