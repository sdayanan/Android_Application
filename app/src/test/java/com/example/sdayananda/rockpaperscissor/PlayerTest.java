package com.example.sdayananda.rockpaperscissor;

import org.junit.Test;

/**
 * Tests Player behavior
 *
 * @author Vladimir Livin
 */
public class PlayerTest {
    @Test
    public void playerShouldBeAbleToSelectTheTurn() {
        Player p = new Player(Turn.PAPER);
        assertEquals(Turn.PAPER, p.getNextTurn());
    }
}
