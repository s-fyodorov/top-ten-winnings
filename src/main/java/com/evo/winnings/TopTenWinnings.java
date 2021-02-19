package com.evo.winnings;

import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;

public class TopTenWinnings {

    private final ConcurrentSkipListSet<Winning> winnings = new ConcurrentSkipListSet<>();

    public void sendWinningAmount(Winning winning) {
            winnings.add(winning);
    }

    public TreeSet<Winning> getTopTenWinnings() {
        return winnings
                .stream()
                .limit(10)
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
