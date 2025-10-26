import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = input.nextLine();
        System.out.print("Enter a noun:");
        noun1 = input.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = input.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb1 = input.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 =input.nextLine();

        System.out.println("\nToday I went to a " + adjective1 + " zoo." );
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        input.close();
    }
}