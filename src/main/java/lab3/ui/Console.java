package lab3.ui;
import java.util.Scanner;
import lab3.game.Game;
public class Console {

    // TODO: create a CLASS method to display a tictactoe board

    // TODO: create a CLASS method to get the next move from a player
    private Game game;
    private Scanner scanner;

    public Console() {
        this.game = new Game();
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        while (!game.isGameOver()) {
            game.printBoard();
            System.out.println("Enter row (0-2) and column (0-2) separated by space: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (!game.makeMove(row, col)) {
                System.out.println("Invalid move! Try again.");
            }
        }
        game.printBoard();
        System.out.println("Game over! " + game.getWinnerMessage());
    }
}