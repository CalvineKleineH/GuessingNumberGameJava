import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Init of scanner
        Scanner input = new Scanner(System.in);

        String[] levelGame = {"Easy", "Medium", "Hard"};
        int[] tries = {10, 5, 3};



        //Welcome Message
        System.out.println("Welcome to the Number Guessing Game!\n" +
                "I'm thinking of a number between 1 and 100.\n"+
                "Please select the difficulty level:\n" +
                "1. Easy (10 chances)\n" +
                "2. Medium (5 chances)\n" +
                "3. Hard (3 chances)\n");

        //Select level
        System.out.print("Enter your choice: ");
        int n = Integer.parseInt(input.nextLine());

        int attempts = tries[n-1];
        System.out.printf("Great! You have selected the %s difficulty level. " +
                "Let's start the game! " +
                "You have %d chances to guess the correct number.", levelGame[n-1], attempts);

        //Guess the Number
        int guessNumber = (int) (Math.random() * 99 + 1);

        //Brain of Game
        while (attempts > 0) {
            //Choice of player
            System.out.print("Enter your Guess: ");
            int choice = Integer.parseInt(input.nextLine());


            //Verification of choice
            if (guessNumber > choice) {
                System.out.printf("Incorrect! The number is greater than %d\n", choice);
                --attempts;
            } else if (guessNumber < choice) {
                System.out.printf("Incorrect! The number is less than %d\n", choice);
                --attempts;
            } else {
                System.out.printf("Congratulations! You guessed the correct number in %d attempts.", tries[n-1] - attempts + 1);
                break;
            }

        }
        input.close();


    }

}