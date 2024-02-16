package com.example.student.service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Optional<Student> getStudentById(Long studentId) {
        return repository.findById(studentId);
    }

    public Student updateStudent(Long studentId, Student student) {
        if (repository.existsById(studentId)) {
            student.setStudentId(studentId);
            return repository.save(student);
        } else {
            return null; // Student not found
        }
    }

    public String deleteStudent(Long studentId) {
        if (repository.existsById(studentId)) {
            repository.deleteById(studentId);
            return "Student removed !! " + studentId;
        } else {
            return "Student not found !! " + studentId;
        }
    }
}

