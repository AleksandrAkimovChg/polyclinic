package com.javaacademy.polyclinic;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@AllArgsConstructor
@Slf4j
public class Doctor {
    private BigDecimal price;
    private SpecializationType specialization;

    public BigDecimal heal() {
        log.info("{} вылечил человека", specialization);
        return price;
    }
}
