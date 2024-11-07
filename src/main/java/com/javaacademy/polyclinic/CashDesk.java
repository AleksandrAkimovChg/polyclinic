package com.javaacademy.polyclinic;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@NoArgsConstructor
@Slf4j
@Component
public class CashDesk {
    private BigDecimal profit = BigDecimal.ZERO;

    public void addProfit(BigDecimal income) {
        this.profit = profit.add(income);
    }

    public void printProfit() {
        log.info("Текущий доход: {}", profit);
    }
}
