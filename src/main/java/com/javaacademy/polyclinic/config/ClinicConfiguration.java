package com.javaacademy.polyclinic.config;

import com.javaacademy.polyclinic.CashDesk;
import com.javaacademy.polyclinic.Doctor;
import com.javaacademy.polyclinic.SpecializationType;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(value = DoctorProperty.class)
@Configuration
public class ClinicConfiguration {
    private final DoctorProperty doctorProperty;

    public ClinicConfiguration(DoctorProperty doctorProperty) {
        this.doctorProperty = doctorProperty;
    }

    @Bean
    public CashDesk cashes() {
        return new CashDesk();
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(doctorProperty.getDentist(), SpecializationType.DENTIST);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(doctorProperty.getTherapist(), SpecializationType.THERAPIST);
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(doctorProperty.getJuniorSurgeon(), SpecializationType.SURGEON);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(doctorProperty.getSeniorSurgeon(), SpecializationType.SURGEON);
    }
}
