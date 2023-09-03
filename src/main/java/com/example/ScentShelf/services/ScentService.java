package com.example.ScentShelf.services;

import com.example.ScentShelf.models.Scent;
import com.example.ScentShelf.repositories.ScentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScentService {

    private final ScentRepository repository;

    @Autowired
    public ScentService(ScentRepository repository) {
        this.repository = repository;
    }

    public List<Scent> getAllEntities() {
        return repository.findAll();
    }

    public Scent get(Long id) {
        return repository.findById(id).get();
    }
}
