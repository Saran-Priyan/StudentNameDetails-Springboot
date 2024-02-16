package com.example.studentexams.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENT_EXAMS")
public class StudentExam {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String subject;
    private int marks;
    private int year;
}
