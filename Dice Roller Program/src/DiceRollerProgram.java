import java.util.Scanner;
import java.util.Random;

public class DiceRollerProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        System.out.print("Enter the # of dice to roll: ");
        numOfDice = input.nextInt();

        if (numOfDice > 0){
            for (int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else {
            System.out.println("Number of dice must be greater than 0");

            input.close();
        }
    }

    static void printDie(int roll){
        String dice1 ="""
                 -------
                |       |
                |   0   |
                |       |
                 -------
                """;
        String dice2 ="""
                 -------
                | 0     |
                |       |
                |     0 |
                 -------
                """;
        String dice3 ="""
                 -------
                | 0     |
                |   0   |
                |     0 |
                 -------
                """;
        String dice4 ="""
                 -------
                | 0   0 |
                |       |
                | 0   0 |
                 -------
                """;
        String dice5 ="""
                 -------
                | 0   0 |
                |   0   |
                | 0   0 |
                 -------
                """;
        String dice6 ="""
                 -------
                | 0   0 |
                | 0   0 |
                | 0   0 |
                 -------
                """;

        switch (roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
        }
    }
}