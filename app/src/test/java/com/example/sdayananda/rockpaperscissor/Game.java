package com.example.sdayananda.rockpaperscissor;

/**
 * Represents a Rock-Paper-Scissors game.
 *
 * The game takes two players A and B.
 *
 * Both is asked for the turn.
 * The player of winning turn is a winner.
 *
 * @author Vladimir Livin
 */
public class Game {
    private Player a;
    private Player b;

    public Game(Player a, Player b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Returns a winner of this game-round.
     *
     * @return a Player who won this game.
     */
    public Player getWinner() {
        Turn turnOfPlayerA = a.getNextTurn();
        Turn turnOfPlayerB = b.getNextTurn();

        Turn winningTurn = turnOfPlayerA.versus(turnOfPlayerB);
        if (turnOfPlayerA.equals(winningTurn)) {
            return a;
        } else if (turnOfPlayerB.equals(winningTurn)) {
            return b;
        }
        return null;
    }
}
