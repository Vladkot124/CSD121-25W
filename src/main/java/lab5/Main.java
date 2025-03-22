import lab5.Board;
import lab5.Player;
import lab5.player.Circe;
import lab5.player.Omola;
import lab5.player.HumanPlayer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe!");
        System.out.print("Enter Player 1 name: ");
        String player1Name = scanner.nextLine();
        System.out.print("Choose Player 1 type (human, circe, omola): ");
        String player1Type = scanner.nextLine().toLowerCase();

        System.out.print("Enter Player 2 name: ");
        String player2Name = scanner.nextLine();
        System.out.print("Choose Player 2 type (human, circe, omola): ");
        String player2Type = scanner.nextLine().toLowerCase();

        Player player1 = createPlayer(player1Name, player1Type);
        Player player2 = createPlayer(player2Name, player2Type);

        Board board = new Board();
        TicTacToeGame game = new TicTacToeGame(board, player1, player2);
        game.play();

        scanner.close();
    }

    private static Player createPlayer(String name, String type) {
        switch (type) {
            case "human":
                return new HumanPlayer(name);
            case "circe":
                return new Circe(name);
            case "omola":
                return new Omola(name);
            default:
                throw new IllegalArgumentException("Unknown player type: " + type);
        }
    }
}
