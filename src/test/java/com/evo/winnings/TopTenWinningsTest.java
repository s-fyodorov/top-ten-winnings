package com.evo.winnings;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TopTenWinningsTest {

    @Test
    public void testTopWinnings() {

        var topTenWinnings = new TopTenWinnings();
        topTenWinnings.sendWinningAmount(new Winning(1, new BigDecimal("1000")));
        topTenWinnings.sendWinningAmount(new Winning(2, new BigDecimal("5000")));
        topTenWinnings.sendWinningAmount(new Winning(3, new BigDecimal("500")));
        topTenWinnings.sendWinningAmount(new Winning(2, new BigDecimal("2000")));
        topTenWinnings.sendWinningAmount(new Winning(1, new BigDecimal("3000")));
        topTenWinnings.sendWinningAmount(new Winning(2, new BigDecimal("100")));
        topTenWinnings.sendWinningAmount(new Winning(4, new BigDecimal("10")));
        topTenWinnings.sendWinningAmount(new Winning(5, new BigDecimal("200")));
        topTenWinnings.sendWinningAmount(new Winning(6, new BigDecimal("300")));
        topTenWinnings.sendWinningAmount(new Winning(10, new BigDecimal("400")));
        topTenWinnings.sendWinningAmount(new Winning(11, new BigDecimal("4000")));

        var results = new ArrayList<>(topTenWinnings.getTopTenWinnings());
        assertEquals(10, results.size());

        assertEquals(new Winning(2, new BigDecimal("5000")), results.get(0));
        assertEquals(new Winning(11, new BigDecimal("4000")), results.get(1));
        assertEquals(new Winning(1, new BigDecimal("3000")), results.get(2));
        assertEquals(new Winning(2, new BigDecimal("2000")), results.get(3));
        assertEquals(new Winning(1, new BigDecimal("1000")), results.get(4));
        assertEquals(new Winning(3, new BigDecimal("500")), results.get(5));
        assertEquals(new Winning(10, new BigDecimal("400")), results.get(6));
        assertEquals(new Winning(6, new BigDecimal("300")), results.get(7));
        assertEquals(new Winning(5, new BigDecimal("200")), results.get(8));
        assertEquals(new Winning(2, new BigDecimal("100")), results.get(9));

    }

}