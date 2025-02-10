package lab3.game;

public class Game {
    private char[][] board;
    private char currentPlayer;

    public Game() {
        board = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        currentPlayer = 'X';
    }

    public void printBoard() {
        System.out.println("Current Board:");
        for (char[] row : board) {
            System.out.println("| " + row[0] + " | " + row[1] + " | " + row[2] + " |");
        }
    }

    public boolean makeMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
            return false;
        }
        board[row][col] = currentPlayer;
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        return true;
    }

    public boolean isGameOver() {
        return checkWin() || checkDraw();
    }

    public String getWinnerMessage() {
        if (checkWin()) {
            return "Player " + ((currentPlayer == 'X') ? 'O' : 'X') + " wins!";
        }
        return "It's a draw!";
    }

    private boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) return true;
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) return true;
        }
        return (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]);
    }

    private boolean checkDraw() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ') return false;
            }
        }
        return true;
    }
}
