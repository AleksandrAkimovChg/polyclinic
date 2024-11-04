package com.javaacademy.polyclinic.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "price")
@Data
public class DoctorProperty {
    private String dentist;
    private String therapist;
    private String juniorSurgeon;
    private String seniorSurgeon;
}
