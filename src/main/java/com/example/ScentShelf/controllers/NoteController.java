package com.example.ScentShelf.controllers;

import com.example.ScentShelf.models.Fragrance;
import com.example.ScentShelf.models.Note;
import com.example.ScentShelf.services.FragranceService;
import com.example.ScentShelf.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    NoteService service;

    @Autowired
    NoteController(NoteService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<Note>> getPersonList() {

        return new ResponseEntity<List<Note>>(service.getAllEntities() , HttpStatus.OK);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Note> show(@PathVariable("id") Long id) {
//        return new ResponseEntity<>(service.get(id), HttpStatus.OK);
//    }
}

