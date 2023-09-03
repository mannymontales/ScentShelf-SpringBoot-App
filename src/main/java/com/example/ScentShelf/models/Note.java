package com.example.ScentShelf.models;

import com.example.ScentShelf.models.enums.NoteType;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor // <--- THIS is it
@Table(name = "note")
public class Note {

    //https://www.baeldung.com/jpa-join-column
    //https://www.geeksforgeeks.org/when-to-use-joincolumn-annotation-in-hibernate/#

    @Id
    //@many to one represents many (this entity) to another entity one (fragrance)
    @ManyToOne //many fragrance scent to ONE fragrance, ex. fragrance notes in top, middle, and base but a fragrance only has one set of these
    //join column used to represent relationship between two entities, fragrance_id is the fk referencing back to the Fragrance table
    @JoinColumn(name = "fragrance_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Fragrance fragrance;

    @Id
    @ManyToOne //many fragrancescent to One scent , ex. bergamot in top, middle, and base but only One bergamont scent
    @JoinColumn(name = "scent_id", nullable = false)
    private Scent scent;

    @Enumerated(EnumType.STRING)
    @Column(name = "note_type")
    private NoteType noteType;

    public Note(Fragrance fragrance, Scent scent, NoteType type) {
        this.fragrance = fragrance;
        this.scent = scent;
        this.noteType = type;
    }

}
