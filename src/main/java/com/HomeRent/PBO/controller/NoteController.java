package com.HomeRent.PBO.controller;


import com.HomeRent.PBO.model.Note;
import com.HomeRent.PBO.repository.NoteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List; // 
@CrossOrigin("*")
@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @PostMapping("/add")
    public Note addNote(@RequestBody Note note) {
        return noteRepository.save(note); // ✅ method save() dari JpaRepository
    }

    @GetMapping("/all")
    public List<Note> getAllNotes() {
        return noteRepository.findAll(); // ✅ method findAll() dari JpaRepository
    }
}