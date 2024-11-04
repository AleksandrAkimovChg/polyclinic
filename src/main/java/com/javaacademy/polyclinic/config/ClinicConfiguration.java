package com.javaacademy.polyclinic.config;

import com.javaacademy.polyclinic.Cashes;
import com.javaacademy.polyclinic.Doctor;
import com.javaacademy.polyclinic.SpecializationType;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@EnableConfigurationProperties(value = DoctorProperty.class)
@Configuration
public class ClinicConfiguration {
    private final DoctorProperty doctorProperty;

    public ClinicConfiguration(DoctorProperty doctorProperty) {
        this.doctorProperty = doctorProperty;
    }

    @Bean
    public Cashes cashes() {
        return new Cashes();
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(new BigDecimal(doctorProperty.getDentist()), SpecializationType.DENTIST);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(new BigDecimal(doctorProperty.getTherapist()), SpecializationType.THERAPIST);
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(new BigDecimal(doctorProperty.getJuniorSurgeon()), SpecializationType.SURGEON);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(new BigDecimal(doctorProperty.getSeniorSurgeon()), SpecializationType.SURGEON);
    }
}
