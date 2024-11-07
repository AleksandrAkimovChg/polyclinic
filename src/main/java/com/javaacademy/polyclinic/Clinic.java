package com.javaacademy.polyclinic;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Clinic {
    private final CashDesk cashes;
    private final Doctor dentist;
    private final Doctor therapist;
    private final Doctor juniorSurgeon;
    private final Doctor seniorSurgeon;

    public Clinic(CashDesk cashes, Doctor dentist, Doctor therapist, Doctor juniorSurgeon, Doctor seniorSurgeon) {
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
