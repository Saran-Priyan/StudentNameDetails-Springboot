package com.example.studentexams.controller;
import com.example.studentexams.entity.StudentExam;
import com.example.studentexams.service.StudentExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentExamController {

    @Autowired
    private StudentExamService service;

    @PostMapping("/exams")
    public StudentExam addExam(@RequestBody StudentExam exam) {
        return service.saveExam(exam);
    }

    @GetMapping("/exams")
    public List<StudentExam> getAllExams() {
        return service.getAllExams();
    }

    @GetMapping("/exams/{id}")
    public Optional<StudentExam> getExamById(@PathVariable Long id) {
        return service.getExamById(id);
    }

    @PutMapping("/exams/{id}")
    public StudentExam updateExam(@PathVariable Long id, @RequestBody StudentExam exam) {
        return service.updateExam(id, exam);
    }

    @DeleteMapping("/exams/{id}")
    public String deleteExam(@PathVariable Long id) {
        return service.deleteExam(id);
    }
}

