package com.example.ScentShelf.controllers;

import com.example.ScentShelf.models.Fragrance;
import com.example.ScentShelf.models.Note;
import com.example.ScentShelf.models.Scent;
import com.example.ScentShelf.services.FragranceService;
import com.example.ScentShelf.services.NoteService;
import com.example.ScentShelf.services.ScentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/scent")
public class ScentController {

    ScentService service;

    @Autowired
    ScentController(ScentService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<Scent>> getPersonList() {

        return new ResponseEntity<List<Scent>>(service.getAllEntities() , HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Scent> show(@PathVariable("id") Long id) {
        return new ResponseEntity<>(service.get(id), HttpStatus.OK);
    }
}

