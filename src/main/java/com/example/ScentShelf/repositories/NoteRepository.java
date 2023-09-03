package com.example.ScentShelf.repositories;

import com.example.ScentShelf.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
