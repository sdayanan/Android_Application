package com.example.sdayananda.rockpaperscissor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Represents a turn of the player.
 *
 * @author Vladimir Livin
 */
public enum Turn {
    ROCK,
    PAPER,
    SCISSORS;

    private static Map<Set<Turn>, Turn> results = results();

    public Turn versus(Turn anotherTurn) {
        if (this.equals(anotherTurn))
            return null;

        return results.get(new HashSet<Turn>(Arrays.asList(this, anotherTurn)));
    }

    private static Map<Set<Turn>, Turn> results() {
        HashMap<Set<Turn>, Turn> m = new HashMap<Set<Turn>, Turn>();
        m.put(new HashSet<Turn>(Arrays.asList(SCISSORS, PAPER)), SCISSORS);
        m.put(new HashSet<Turn>(Arrays.asList(ROCK, SCISSORS)), ROCK);
        m.put(new HashSet<Turn>(Arrays.asList(PAPER, ROCK)), PAPER);
        return m;
    }
}
