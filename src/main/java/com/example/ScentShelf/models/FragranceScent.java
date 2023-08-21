package com.example.ScentShelf.models;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor // <--- THIS is it
@Table(name = "Fragrance Scent")
public class FragranceScent {

    //https://www.baeldung.com/jpa-join-column
    //https://www.geeksforgeeks.org/when-to-use-joincolumn-annotation-in-hibernate/#

    @Id
    //@many to one represents many (this entity) to another entity one (fragrance)
    @ManyToOne //many fragrancescent to ONE fragrance, ex. frgarance notes in top, middle, and base but a fragrance only has one set of these
    //join column used to represenent relationship between two entities, fragrance_id is the fk referencing back to the Fragrance table
    @JoinColumn(name = "fragrance_id")
    private Fragrance fragrance;

    @Id
    @ManyToOne //many fragrancescent to One scent , ex. bergamot in top, middle, and base but only One bergamont scent
    @JoinColumn(name = "scent_id")
    private Scent scent;

    @Column(name = "note_type")
    private String noteType;
}
