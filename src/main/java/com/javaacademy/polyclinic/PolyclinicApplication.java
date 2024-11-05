package com.javaacademy.polyclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PolyclinicApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PolyclinicApplication.class, args);
        Clinic clinic = context.getBean(Clinic.class);
        clinic.dentistHeal();
        clinic.therapistHeal();
        clinic.juniorSurgeonHeal();
        clinic.seniorSurgeonHeal();
        CashDesk cashes = context.getBean(CashDesk.class);
        cashes.printProfit();
    }
}
