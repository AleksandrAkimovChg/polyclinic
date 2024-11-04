package com.javaacademy.polyclinic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class ClinicConfiguration {

    @Bean
    public Casher casher() {
        return new Casher();
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(new BigDecimal("1500"), SpecializationType.DENTIST);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(new BigDecimal("500"), SpecializationType.THERAPIST);
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(new BigDecimal("700"), SpecializationType.SURGEON);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(new BigDecimal("2000"), SpecializationType.SURGEON);
    }
}
