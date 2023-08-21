package com.example.ScentShelf.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@getter, @setter, @noargsconstruct are part of lombok dependency which basically reduces extra code
//https://www.baeldung.com/intro-to-project-lombok
@Entity
@Getter
@Setter
@NoArgsConstructor // <--- THIS is it
@Table(name = "Fragrance")
public class Fragrance {

    /**
     * https://www.javaguides.net/2018/12/hibernatejpa-primary-key-generation-stratergies.html
     * The GenerationType.IDENTITY is the easiest to use but not the best one from a performance point of view.
     * It relies on an auto-incremented database column and lets the database generate a new value with each insert operation.
     * From a database point of view, this is very efficient because the auto-increment columns are highly optimized, and it doesn’t require any additional statements.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //fragrance id

    private String name;

    private String brand;

    public Fragrance(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }
}
