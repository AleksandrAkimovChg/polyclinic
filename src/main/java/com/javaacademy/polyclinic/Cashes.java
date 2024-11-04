package com.javaacademy.polyclinic;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@NoArgsConstructor
@Slf4j
public class Cashes {
    private BigDecimal profit = BigDecimal.ZERO;

    public void addProfit(BigDecimal income) {
        this.profit = profit.add(income);
    }

    public void printProfit() {
        log.info("Текущий доход: {}", profit);
    }
}
