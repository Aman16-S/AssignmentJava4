import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Scissors", "Rock", "Paper"};

        while (true) {
            System.out.println("\nChoose your move (Scissors, Rock, Paper) or type 'exit' to stop:");
            String playerChoice = scan.nextLine().trim().toLowerCase();

            if (playerChoice.equals("exit")) {
                System.out.println("Thanks for playing!");
                break;
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
            } else {
                System.out.println("Computer wins!");
            }
        }

        scan.close();
    }
}

