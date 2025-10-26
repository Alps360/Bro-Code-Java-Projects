import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
        playerChoice = input.nextLine().toLowerCase();

        if (!playerChoice.equals("rock") && 
        !playerChoice.equals("paper") && 
        !playerChoice.equals("scissors")){
            System.out.println("Invalid choice");
            continue;
        }

        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: " + computerChoice);

        if (playerChoice.equals(computerChoice)){
            System.out.println("It's a tie!");
        }
        else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) || 
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
            System.out.println("You win!");
        }
        else {
            System.out.println("You lose!");
        }

        System.out.print("Play again (yes/no): ");
        playAgain = input.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        input.close();
    }
}