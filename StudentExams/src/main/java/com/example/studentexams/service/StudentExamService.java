package com.example.studentexams.service;
import com.example.studentexams.entity.StudentExam;
import com.example.studentexams.repository.StudentExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentExamService {

    @Autowired
    private StudentExamRepository repository;

    public StudentExam saveExam(StudentExam exam) {
        return repository.save(exam);
    }

    public List<StudentExam> getAllExams() {
        return repository.findAll();
    }

    public Optional<StudentExam> getExamById(Long id) {
        return repository.findById(id);
    }

    public StudentExam updateExam(Long id, StudentExam exam) {
        if (repository.existsById(id)) {
            exam.setId(id);
            return repository.save(exam);
        } else {
            return null; // Exam not found
        }
    }

    public String deleteExam(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Exam removed !! " + id;
        } else {
            return "Exam not found !! " + id;
        }
    }
}

