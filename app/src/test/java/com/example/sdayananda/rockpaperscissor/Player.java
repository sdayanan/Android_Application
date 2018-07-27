package com.example.sdayananda.rockpaperscissor;

/**
 * Represents the player logic.
 *
 * @author Vladimir Livin
 */
public class Player {
    private Turn nextTurn;

    public Player(Turn nextTurn) {
        setNextTurn(nextTurn);
    }

    public Player() {
    }

    public Player setNextTurn(Turn nextTurn) {
        this.nextTurn = nextTurn;
        return this;
    }

    public Turn getNextTurn() {
        return nextTurn;
    }
}
