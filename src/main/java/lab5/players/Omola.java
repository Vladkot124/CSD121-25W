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
            Board testBoard = new Board(board);
            testBoard.placeNextToken(move);
            if (testBoard.getWinner() == myToken) {
                return move;
            }
        }

        // Check for a blocking move
        PlayerToken opponent = myToken.opponent();
        for (int move : emptyCells) {
            Board testBoard = new Board(board);
            testBoard.placeNextToken(move);
            if (testBoard.getWinner() == opponent) {
                return move;
            }
        }

        // Otherwise, pick any available move
        return emptyCells.get(0);
    }
}