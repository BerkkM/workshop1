import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1; // Generates a random number between 1 and 10
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 10:");

        while (guess != randomNumber) {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed it right.");
                System.out.println("Number of attempts: " + attempts);
            } else {
                System.out.println("Wrong guess. Try again.");
            }
        }

        scanner.close();
    }
}
