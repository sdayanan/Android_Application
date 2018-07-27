package com.example.sdayananda.rockpaperscissor;

import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @author Vladimir Livin
 */
public class GameTest {
    @Test
    public void playerAwithWinningTurnShouldBeWinner() {
        Player a = new Player(Turn.ROCK);
        Player b = new Player(Turn.SCISSORS);
        assertEquals("Player A with Rock should win Player B with Scissors", a, new Game(a, b).getWinner());
    }

    @Test
    public void playerBwithWinningTurnShouldWinner() {
        Player a = new Player(Turn.ROCK);
        Player b = new Player(Turn.PAPER);
        assertEquals("Player B with Paper should win Player A with Rock", b, new Game(a, b).getWinner());
    }

    @Test
    public void whenBothWithTheSameTurnThereShouldBeNoWinner() {
        assertNull("Rock and Rock should give a tie", new Game(new Player(Turn.ROCK), new Player(Turn.ROCK)).getWinner());
    }
}
