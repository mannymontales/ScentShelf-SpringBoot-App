package com.example.ScentShelf.repositories;

import com.example.ScentShelf.models.Fragrance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FragranceRepository extends JpaRepository<Fragrance, Long> {
}
