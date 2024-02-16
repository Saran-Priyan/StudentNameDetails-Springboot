package com.example.studentevents.controller;
import com.example.studentevents.entity.StudentEvent;
import com.example.studentevents.service.StudentEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentEventController {

    @Autowired
    private StudentEventService service;

    @PostMapping("/events")
    public StudentEvent addEvent(@RequestBody StudentEvent event) {
        return service.saveEvent(event);
    }

    @GetMapping("/events")
    public List<StudentEvent> getAllEvents() {
        return service.getAllEvents();
    }

    @GetMapping("/events/{id}")
    public Optional<StudentEvent> getEventById(@PathVariable Long id) {
        return service.getEventById(id);
    }

    @PutMapping("/events/{id}")
    public StudentEvent updateEvent(@PathVariable Long id, @RequestBody StudentEvent event) {
        return service.updateEvent(id, event);
    }

    @DeleteMapping("/events/{id}")
    public String deleteEvent(@PathVariable Long id) {
        return service.deleteEvent(id);
    }
}
