package com.javaacademy.polyclinic;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
public enum SpecializationType {
    DENTIST("Дантист"),
    SURGEON("Хирург"),
    THERAPIST("Терапевт");

    String name;

    @Override
    public String toString() {
        return name;
    }
}
