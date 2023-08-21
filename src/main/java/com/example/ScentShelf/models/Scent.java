package com.example.ScentShelf.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor // <--- THIS is it
@Table(name = "Scent")
public class Scent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // scent_id

    private String scent;

    //make sure to validate existing scent name when user inputs stuff for the future
    public Scent(String scent) {
        this.scent = scent;
    }
}
