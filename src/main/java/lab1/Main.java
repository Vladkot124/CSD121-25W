package lab1;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, world!");


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        String result = checkNumber(number);
        System.out.println(name + ", the number you entered is " + result + ".");


        System.out.println("Here’s your number printed 5 times:");
        for (int i = 0; i < 5; i++) {
            System.out.println(number);
        }


        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            numbersList.add(number);
        }


        System.out.println("Numbers in the list:");
        for (int num : numbersList) {
            System.out.println(num);
        }


        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("User's Name: " + name + "\n");
            writer.write("Numbers Entered: " + numbersList.toString() + "\n");
            writer.close();
            System.out.println("Information has been written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }



    public static String checkNumber(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }
}


