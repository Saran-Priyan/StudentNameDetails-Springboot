package com.example.studentevents.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENT_EVENTS")
public class StudentEvent {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String eventType;
    private Date eventDate;
    private String eventDescription;
}
