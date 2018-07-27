package com.example.sdayananda.rockpaperscissor;

import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * Tests a turn comparisons for the game.
 *
 * @author Vladimir Livin
 */
public class TurnTest {
    @Test
    public void scissorsVsPaperShouldBeScissors() {
        assertEquals(Turn.SCISSORS, Turn.SCISSORS.versus(Turn.PAPER));
    }

    @Test
    public void rockVsScissorsShouldGiveRock() {
        assertEquals(Turn.ROCK, Turn.ROCK.versus(Turn.SCISSORS));
    }

    @Test
    public void paperVsRockShouldGivePaper() {
        assertEquals(Turn.PAPER, Turn.PAPER.versus(Turn.ROCK));
    }

    @Test
    public void paperVsScissorsShouldGiveScissors() {
        assertEquals(Turn.SCISSORS, Turn.PAPER.versus(Turn.SCISSORS));
    }

    @Test
    public void rockVsRockShouldBeNone() {
        assertNull(Turn.ROCK.versus(Turn.ROCK));
    }
}
