package com.enigma.api.service;

import com.enigma.api.entity.Major;
import com.enigma.api.entity.Student;

import java.util.List;

public interface StudentService {
    public void saveStudent(Student student);
    public Student getStudentById(String id);
    public List<Student> getStudent();
    public void deleteStudentById(String id);
    public void updateStudent(Student student);
}
