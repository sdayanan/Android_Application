package com.example.sdayananda.rockpaperscissor;

import java.io.PrintWriter;

/**
 * A game in which two players compete in a game of Rock-Paper-Scissors with different strategies.
 * Who will win more rounds?
 *
 * The rules:
 *
 * - Scissors beats Paper
 * - Rock beat Scissors
 * - Paper beats Rock
 *
 * If both players choose the same, the round is counted as a tie.
 *
 * Implements two players:
 * - Player A always chooses Paper
 * - Player B chooses randomly
 *
 * Sample output:
 *
 * "Player A wins 31 of 100 games"
 * "Player B wins 37 of 100 games"
 * "Tie: 32 of 100 games"
 *
 * @author Vladimir Livin
 */
public class RockPaperScissors {
    public static final int TOTAL_ROUNDS = 100;
    public static int PLAYER_A = 0;
    public static int PLAYER_B = 1;

    private PrintWriter out;
    private Player playerA;
    private Player playerB;
    private int[] playersScore;
    private int ties;

    public RockPaperScissors() {
        this(new PrintWriter(System.out, true), new Player(Turn.PAPER), new RandomPlayer());
    }

    public RockPaperScissors(PrintWriter out, Player playerA, Player playerB) {
        this.out = out;
        this.playerA = playerA;
        this.playerB = playerB;

        playersScore = new int[] {0, 0};
        ties = 0;
    }

    public void run() {
        out.println("Rock-Paper-Scissors game");
        out.println();

        for(int rounds = 1; rounds <= TOTAL_ROUNDS; rounds++)
            playGameRound();

        out.println(String.format("Player A wins %d of 100 games", getPlayersScore()[PLAYER_A]));
        out.println(String.format("Player B wins %d of 100 games", getPlayersScore()[PLAYER_B]));
        out.println(String.format("Tie: %d of 100 games", getTies()));
    }

    private void playGameRound() {
        Player winner = new Game(playerA, playerB).getWinner();
        if (winner != null) {
            scoreUpWinner(winner);
        } else {
            ties++;
        }
    }

    private void scoreUpWinner(Player winner) {
        playersScore[winner.equals(playerA)?PLAYER_A:PLAYER_B]++;
    }

    public int[] getPlayersScore() {
        return playersScore;
    }

    public int getTies() {
        return ties;
    }

    public static void main(String[] args) {
        new RockPaperScissors().run();
    }
}
