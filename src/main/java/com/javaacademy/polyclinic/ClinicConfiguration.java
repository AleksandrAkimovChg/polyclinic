package com.javaacademy.polyclinic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class ClinicConfiguration {
    @Value("${price.dentist}")
    String dentistPrice;
    @Value("${price.therapist}")
    String therapistPrice;
    @Value("${price.juniorSurgeon}")
    String juniorSurgeonPrice;
    @Value("${price.seniorSurgeon}")
    String seniorSurgeonPrice;

    @Bean
    public Cashes cashes() {
        return new Cashes();
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(new BigDecimal(dentistPrice), SpecializationType.DENTIST);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(new BigDecimal(therapistPrice), SpecializationType.THERAPIST);
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(new BigDecimal(juniorSurgeonPrice), SpecializationType.SURGEON);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(new BigDecimal(seniorSurgeonPrice), SpecializationType.SURGEON);
    }
}
