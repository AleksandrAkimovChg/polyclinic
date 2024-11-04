package com.javaacademy.polyclinic;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum SpecializationType {
    DENTIST("Дантист"),
    SURGEON("Хирург"),
    THERAPIST("Терапевт");

    private final String name;

    @Override
    public String toString() {
        return name;
    }
}
