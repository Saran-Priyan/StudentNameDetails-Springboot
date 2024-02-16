package com.example.student.entity;

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
@Table(name = "STUDENT_DETAILS")
public class Student {

    @Id
    @GeneratedValue
    private Long studentId;
    private String name;
    private int age;
    private String gender;
    private int grade;
}

