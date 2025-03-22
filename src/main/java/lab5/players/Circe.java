package lab5.player;

import lab5.Board;
import java.util.List;

public class Circe extends Player {

    private static final int[] MOVE_ORDER = {4, 1, 2, 5, 8, 7, 6, 3, 0};

    public Circe(String name) {
        super(name);
    }

    @Override
    public int pickNextMove(Board board) {
        List<Integer> emptyCells = board.getEmptyCells();

        for (int move : MOVE_ORDER) {
            if (emptyCells.contains(move)) {
                return move; // Pick the first available move in order
            }
        }

        return -1; // Should never happen if board is valid
    }
}
✅ Modify Console.java to Add Circe as an Option
Find promptForPlayer in Console.java and modify it:

java
        Copy
Edit
public static Player promptForPlayer(String playerName, String type) {
    switch (type.toLowerCase()) {
        case "human":
            return new HumanPlayer(playerName);
        case "circe":
            return new Circe(playerName);
        default:
            throw new IllegalArgumentException("Unknown player type: " + type);
    }
}
✅ Modify Main.java to Show Circe as an Option
Find the welcome message in Main.java and update it to mention Circe:

java
        Copy
Edit
System.out.println("Welcome to Tic Tac Toe! Choose your player type: human, circe");
✅ Test Circe
Try playing a game with Circe as the opponent!

If Circe is working correctly, it should always:

Play the center if available.

Then follow its clockwise order.

        Step 4: Implement an Advanced AI Player (Omola)
Omola follows this strategy:

If there's a winning move, play it.

If the opponent has a winning move, block it.

Otherwise, play any available move.

        ✅ Create Omola.java
Inside the player package, create a new class Omola.java:

java
        Copy
Edit
package lab5.player;

import lab5.Board;
import lab5.PlayerToken;
import java.util.List;

public class Omola extends Player {

    public Omola(String name) {
        super(name);
    }

    @Override
    public int pickNextMove(Board board) {
        List<Integer> emptyCells = board.getEmptyCells();
        PlayerToken myToken = board.getNextTurnToken();

        // Check for a winning move
        for (int move : emptyCells) {
            Board testBoard = new Board(board); // Copy board
            testBoard.placeNextToken(move);
            if (testBoard.getWinner() == myToken) {
                return move; // Play winning move
            }
        }

        // Check for a blocking move
        PlayerToken opponent = myToken.opponent();
        for (int move : emptyCells) {
            Board testBoard = new Board(board);
            testBoard.placeNextToken(move);
            if (testBoard.getWinner() == opponent) {
                return move; // Block opponent
            }
        }

        // Otherwise, pick any available move
        return emptyCells.get(0);
    }
}