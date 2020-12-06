package com.enigma.api.controller;

import com.enigma.api.entity.Student;
import com.enigma.api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudent();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/student")
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @PutMapping("/student")
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @DeleteMapping("/student")
    public void deleteStudentId(@RequestParam(name = "id") String id){
        studentService.deleteStudentById(id);
    }
}
