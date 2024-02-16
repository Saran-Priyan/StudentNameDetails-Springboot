package com.example.studentexams.repository;
import com.example.studentexams.entity.StudentExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentExamRepository extends JpaRepository<StudentExam, Long> {
}

