package org.example.studentmanagementsystem;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {

    public StudentService() {

    }

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public String getStringOfStudents() {
        StringBuilder ss = new StringBuilder();
        for (Student student : students) {
            ss.append(student.getId()).append(" ");
            ss.append(student.getName()).append(" ");
            ss.append(student.getLastName()).append("\n");
        }

        return ss.toString();
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void removeStudent(Student delStudent) {
        students.remove(delStudent);
    }

    public void removeStudentById(int id) {

        students.removeIf(student -> student.getId() == id);

    }

    @PostConstruct
    public void init() {
        students.add(new Student(1, "Jan", "Kowalski"));
        students.add(new Student(2, "Adam", "Wojciechowski"));
    }


}
