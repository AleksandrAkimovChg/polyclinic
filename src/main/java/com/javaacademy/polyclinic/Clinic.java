package com.javaacademy.polyclinic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Clinic {
    private final CashDesk cashes;
    private final Doctor dentist;
    private final Doctor therapist;
    private final Doctor juniorSurgeon;
    private final Doctor seniorSurgeon;

    public Clinic(@Qualifier("cashes") CashDesk cashes,
                  @Qualifier("dentist") Doctor dentist,
                  @Qualifier("therapist") Doctor therapist,
                  @Qualifier("juniorSurgeon") Doctor juniorSurgeon,
                  @Qualifier("seniorSurgeon") Doctor seniorSurgeon) {
        this.cashes = cashes;
        this.dentist = dentist;
        this.therapist = therapist;
        this.juniorSurgeon = juniorSurgeon;
        this.seniorSurgeon = seniorSurgeon;
    }

    public void dentistHeal() {
        healing(dentist);
    }

    public void therapistHeal() {
        healing(therapist);
    }

    public void juniorSurgeonHeal() {
        healing(juniorSurgeon);
    }

    public void seniorSurgeonHeal() {
        healing(seniorSurgeon);
    }

    private void healing(Doctor doctor) {
        BigDecimal price = doctor.heal();
        cashes.addProfit(price);
    }
}
