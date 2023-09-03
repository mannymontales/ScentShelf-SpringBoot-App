package com.example.ScentShelf.services;

import com.example.ScentShelf.models.Fragrance;
import com.example.ScentShelf.models.Note;
import com.example.ScentShelf.repositories.FragranceRepository;
import com.example.ScentShelf.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository repository;

    @Autowired
    public NoteService(NoteRepository repository) {
        this.repository = repository;
    }

    public List<Note> getAllEntities() {
        return repository.findAll();
    }

    public Note get(Long id) {
        return repository.findById(id).get();
    }
}
