package com.example.ScentShelf.repositories;

import com.example.ScentShelf.models.Scent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScentRepository extends JpaRepository<Scent, Long> {
}
