package com.enigma.api.service;

import com.enigma.api.entity.Major;
import com.enigma.api.entity.Student;
import com.enigma.api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    MajorService majorService;

    @Override
    public void saveStudent(Student student) {
//        Major major = majorService.getMajorById(student.getTempMajorId());
//        student.setMajor(major);
        majorService.getMajorById(student.getMajor().getId());
        studentRepository.save(student);
    }

    @Override
    public Student getStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }
}
