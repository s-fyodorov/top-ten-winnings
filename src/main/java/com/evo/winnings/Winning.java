package com.evo.winnings;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Winning implements Comparable<Winning> {

    private final long userId;

    @NonNull
    private final BigDecimal amount;

    public int compareTo(Winning other) {
        return other.amount.compareTo(amount);
    }
}
