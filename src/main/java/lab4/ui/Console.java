package lab4.ui;

import lab4.game.*;

import java.util.Scanner;

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;



/**
 * Helper methods for doing console-based user interaction
 */
public class Console {

    public static void println(String message, Attribute color) {
        System.out.println(colorize(message, color));
    }
    /**
     * Prompt the user for input using the given promptMessage
     * @param promptMessage The message to prompt the user with
     * @return The user's response
     */
    public static String prompt(String promptMessage) {
        System.out.print(promptMessage);
        var scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Display the given game board
     * @param board A tictactoe game board
     */
    public static void showBoard(Board board) {
        System.out.print(colorize(board.toString(), Attribute.TEXT_COLOR(36))); // Cyan board
    }

    /**
     * Repeatedly prompt the user for a position on which to place their next token.
     * If they enter an invalid response or an already-taken position they are re-prompted.
     * @param prompt The prompt to display to the user
     * @param board The current state of the game board
     * @return The position selected by the user
     */
    public static Position promptForPosition(String prompt, Board board) {
        var scanner = new Scanner(System.in);
        final String helpMessage = colorize(
                "Input must be in the format 'row column', e.g., '1 2' or 't m' for the top middle cell.",
                Attribute.TEXT_COLOR(226)); // Yellow

        while (true) {
            System.out.print(colorize(prompt, Attribute.TEXT_COLOR(34))); // Blue prompt
            var input = scanner.nextLine().trim();

            if (input.length() != 3) {
                println(helpMessage, Attribute.TEXT_COLOR(226)); // Yellow help message
                continue;
            }

            var parts = input.split(" ");

            if (parts.length != 2) {
                println(helpMessage, Attribute.TEXT_COLOR(226)); // Yellow help message
                continue;
            }

            try {
                var pos = new Position(Row.from(parts[0]), Col.from(parts[1]));

                if (board.isOccupiedAt(pos)) {
                    println("That position is already taken.", Attribute.TEXT_COLOR(196)); // Red error
                    continue;
                }

                return pos;
            } catch (IllegalArgumentException e) {
                println(helpMessage, Attribute.TEXT_COLOR(226)); // Yellow help message
            }
        }
    }
}
