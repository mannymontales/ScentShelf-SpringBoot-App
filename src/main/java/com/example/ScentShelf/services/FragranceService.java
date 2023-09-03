package com.example.ScentShelf.services;

import com.example.ScentShelf.models.Fragrance;
import com.example.ScentShelf.repositories.FragranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FragranceService {
    private final FragranceRepository repository;

    @Autowired
    public FragranceService(FragranceRepository repository) {
        this.repository = repository;
    }

    public List<Fragrance> getAllEntities() {
        return repository.findAll();
    }
}
