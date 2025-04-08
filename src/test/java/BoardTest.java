package lab4.game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void testPlaceX() {
        Board board = new Board();
        Position pos = new Position(Row.Top, Col.Left);
        board.placeX(pos);
        assertTrue(board.isOccupiedAt(pos), "Position should be occupied after placing X");
    }

    @Test
    void testPlaceO() {
        Board board = new Board();
        Position pos = new Position(Row.Middle, Col.Middle);
        board.placeO(pos);
        assertTrue(board.isOccupiedAt(pos), "Position should be occupied after placing O");
    }

    @Test
    void testWinConditionRow() {
        Board board = new Board();
        board.placeX(new Position(Row.Top, Col.Left));
        board.placeX(new Position(Row.Top, Col.Middle));
        board.placeX(new Position(Row.Top, Col.Right));
        assertEquals(Board.Status.XWins, board.getStatus(), "X should win with a complete row");
    }

    @Test
    void testDrawCondition() {
        Board board = new Board();
        board.placeX(new Position(Row.Top, Col.Left));
        board.placeO(new Position(Row.Top, Col.Middle));
        board.placeX(new Position(Row.Top, Col.Right));

        board.placeX(new Position(Row.Middle, Col.Left));
        board.placeX(new Position(Row.Middle, Col.Middle));
        board.placeO(new Position(Row.Middle, Col.Right));

        board.placeO(new Position(Row.Bottom, Col.Left));
        board.placeX(new Position(Row.Bottom, Col.Middle));
        board.placeO(new Position(Row.Bottom, Col.Right));

        assertEquals(Board.Status.Draw, board.getStatus(), "Game should be a draw");
    }
}