package lab5.player;

import lab5.game.Board;
import lab5.game.TurnRecord;
import lab5.ui.Console;
import java.util.List;

/**
 * Represents a human player in Tic Tac Toe.
 */
public class HumanPlayer extends tictactoe.players.Player {

    /**
     * Constructs a HumanPlayer with a given name.
     * @param name The name of the player.
     */
    public HumanPlayer(String name) {
        super(name);
    }

    /**
     * Allows a human player to pick their next move by prompting via the console.
     * @param board The current game board.
     * @return The chosen move as an integer.
     */
    @Override
    public int pickNextMove(Board board) {
        List<Integer> emptyCells = board.getEmptyCells();

        Scanner scanner = new Scanner(System.in);
        int move;

        while (true) {
            System.out.println("Available moves: " + emptyCells);
            System.out.print("Enter your move: ");

            if (scanner.hasNextInt()) {
                move = scanner.nextInt();
                if (emptyCells.contains(move)) {
                    break; // Valid move
                } else {
                    System.out.println("Invalid move. Please choose an available cell.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
        return move;
    }
