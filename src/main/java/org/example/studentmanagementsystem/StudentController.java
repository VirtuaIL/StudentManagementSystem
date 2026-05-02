package org.example.studentmanagementsystem;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAll() {
        return studentService.getStudents();
    }

    @PostMapping("/students")
    public void add(@RequestBody Student student) {
        studentService.addStudent(student);
    }


}
