package org.example.studentmanagementsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentServiceTest {

    private StudentService studentService;

    @BeforeEach
    void setUp() {
        studentService = new StudentService();
    }


    @Test
    void addStudent() {
        Student stud = new Student(1, "Jan", "Kowalski");
        studentService.addStudent(stud);
        assertEquals(1, studentService.getStudents().size());
    }

    @Test
    void removeStudent() {
        Student stud = new Student(1, "Jan", "Kowalski");
        studentService.addStudent(stud);
        studentService.removeStudentById(1);
        assertEquals(true, studentService.getStudents().isEmpty());
    }


}
