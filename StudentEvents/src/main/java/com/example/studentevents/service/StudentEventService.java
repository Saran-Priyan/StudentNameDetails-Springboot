package com.example.studentevents.service;
import com.example.studentevents.entity.StudentEvent;
import com.example.studentevents.repository.StudentEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentEventService {

    @Autowired
    private StudentEventRepository repository;

    public StudentEvent saveEvent(StudentEvent event) {
        return repository.save(event);
    }

    public List<StudentEvent> getAllEvents() {
        return repository.findAll();
    }

    public Optional<StudentEvent> getEventById(Long id) {
        return repository.findById(id);
    }

    public StudentEvent updateEvent(Long id, StudentEvent event) {
        if (repository.existsById(id)) {
            event.setId(id);
            return repository.save(event);
        } else {
            return null; // Event not found
        }
    }

    public String deleteEvent(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Event removed !! " + id;
        } else {
            return "Event not found !! " + id;
        }
    }
}
