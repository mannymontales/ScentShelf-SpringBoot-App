package com.example.ScentShelf.controllers;

import com.example.ScentShelf.models.Fragrance;
import com.example.ScentShelf.services.FragranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fragrance")
public class FragranceController {

    FragranceService fragranceService;


    @Autowired
    FragranceController(FragranceService fragranceService) {
        this.fragranceService = fragranceService;
    }

    @GetMapping()
    public ResponseEntity<List<Fragrance>> getPersonList() {

        return new ResponseEntity<List<Fragrance>>(fragranceService.getAllEntities() , HttpStatus.OK);
    }
}
