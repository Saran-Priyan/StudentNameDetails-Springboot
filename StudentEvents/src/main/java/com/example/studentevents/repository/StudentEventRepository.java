package com.example.studentevents.repository;
import com.example.studentevents.entity.StudentEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentEventRepository extends JpaRepository<StudentEvent, Long> {
}

