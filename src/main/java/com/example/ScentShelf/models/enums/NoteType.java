package com.example.ScentShelf.models.enums;

public enum NoteType {
    TOP("Top"),
    MIDDLE("Middle"),
    BASE("Base");

    //hold the textual representation of each enum constant (e.g., "Top", "Middle", "Base").
    private final String value;

    NoteType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
