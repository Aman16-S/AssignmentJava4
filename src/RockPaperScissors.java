import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Scissors", "Rock", "Paper"};

        int playerScore = 0;
        int computerScore = 0;

        while (true) {
            System.out.println("\nChoose your move (Scissors, Rock, Paper) or type 'exit' to stop:");
            String playerChoice = scan.nextLine().trim().toLowerCase();

            if (playerChoice.equals("exit")) {
                System.out.println("Thanks for playing!");
                System.out.println("Final Score - You: " + playerScore + " | Computer: " + computerScore);
                break;
            }

            if (!playerChoice.equals("scissors") && !playerChoice.equals("rock") && !playerChoice.equals("paper")) {
                System.out.println("Invalid choice. Please select Scissors, Rock, or Paper.");
                continue;
            }

            // Generate computer choice
            int computerIndex = random.nextInt(3);
            String computerChoice = options[computerIndex].toLowerCase();
            System.out.println("Computer chose: " + options[computerIndex]);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("You win!");
                playerScore++;
            } else {
                System.out.println("Computer wins!");
                computerScore++;
            }

            // Display current score
            System.out.println("Current Score - You: " + playerScore + " | Computer: " + computerScore);
        }

        scan.close();
    }
}
