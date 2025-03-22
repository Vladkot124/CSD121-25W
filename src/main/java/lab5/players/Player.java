package lab5.player;

import lab5.game.Board;

/**
 * Abstract class representing a player in Tic Tac Toe.
 */
public abstract class Player {
    protected String name;

    /**
     * Constructs a player with a given name.
     * @param name The player's name.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Gets the player's name.
     * @return The player's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Abstract method to pick the next move.
     * Must be implemented by subclasses.
     * @param board The current game board.
     * @return The chosen move as an integer.
     */
    public abstract int pickNextMove(Board board);
}

