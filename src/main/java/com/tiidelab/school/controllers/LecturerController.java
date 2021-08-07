package com.tiidelab.school.controllers;

import com.tiidelab.school.models.Lecturer;
import com.tiidelab.school.repositories.LecturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/lecturers/")
public class LecturerController {

    @Autowired
 private LecturerRepository lecturerRepository;

    @GetMapping
    public List<Lecturer> getAllLecturers()
    {
        return lecturerRepository.findAll();

    }

    // /api/lecturers/5
    @GetMapping
    @RequestMapping("{id}")
    public Optional<Lecturer> getLecturerById(@PathVariable Long id)
    {
        return lecturerRepository.findById(id);
    }

    @PostMapping
    public Lecturer createLecturer(@RequestBody Lecturer lecturer)
    {
        return lecturerRepository.saveAndFlush(lecturer);

    }

    @DeleteMapping
    @RequestMapping("{id}")
    public void deleteLecturer(@PathVariable Long id)
    {
        lecturerRepository.deleteById(id);

    }


}
