package com.javaacademy.polyclinic;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class Clinic {
    private Casher casher;
    private Doctor dentist;
    private Doctor therapist;
    private Doctor juniorSurgeon;
    private Doctor seniorSurgeon;

    public void dentistHeal() {
        heal(dentist);
    }

    public void therapistHeal() {
        heal(therapist);
    }

    public void juniorSurgeonHeal() {
        heal(juniorSurgeon);
    }

    public void seniorSurgeonHeal() {
        heal(seniorSurgeon);
    }

    private void heal(Doctor doctor) {
        casher.addProfit(doctor.heal());
    }
}
