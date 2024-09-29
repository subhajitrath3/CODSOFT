package internship;

import java.util.Scanner;

public class numberGame {

    public static void main(String[] args) {
        int userguess, computerguess;
        int totalmatches = 0;
        int noofwins = 0;
        int totalattempts = 0;
        int maxAttempts = 10;
        Scanner sc = new Scanner(System.in);

        while (true) {
            totalmatches++;
            computerguess = (int) (1 + Math.random() * (100 - 1));
            int attempts = 0;
            boolean Win = false;
            System.out.println("Guess a number between 1 and 100:");

            while (attempts < maxAttempts) {
                int userGuess = sc.nextInt();
                attempts++;
                totalattempts++;

                if (userGuess < computerguess) {
                    System.out.println("Too low!,Try again ");
                    System.out.println();
                } else if (userGuess > computerguess) {
                    System.out.println("Too high!, Try again");
                    System.out.println();
                } else {
                    System.out.println("Congratulation ,You guessed it correct");
                    noofwins++;
                    Win = true;
                    break;
                }
            }
            if (!Win) {
                System.out.println("You have reached to the maximum try , please Restart");
                System.out.println("The number was: " + computerguess);
                System.out.println();
                System.out.println("Dont loose so easily , You can do it !!!");
            }
            System.out.println("Wanna play another round ??");
            System.out.println();
            System.out.println("Do you want to play again? for 'YES' press 1 and for 'NO' press 2 ");
            int userreply = sc.nextInt();
            if (userreply == 1) {
                while (attempts < maxAttempts) {
                    int userGuess = sc.nextInt();
                    attempts++;
                    totalattempts++;

                    if (userGuess < computerguess) {
                        System.out.println("Too low!,Try again ");
                        System.out.println();
                    } else if (userGuess > computerguess) {
                        System.out.println("Too high!, Try again");
                        System.out.println();
                    } else {
                        System.out.println("Congratulation ,You guessed it correct");
                        noofwins++;
                        Win = true;
                        break;
                    }
                }
            } else if (userreply == 2) {
                break;
            } else {
                System.out.println("Please enter a valid Option");
                break;
            }
        }
        System.out.println();
        for (int i = 0; i < 50; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Total Attempts" + "  |  " + "Total Matches" + "  |  " + "Wins");
        System.out.println(
                " " + totalattempts + "             |   " + totalmatches + "             |  " + noofwins + " ");
        System.out.println();
        for (int i = 0; i < 50; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("End of the game :)Hope you enjoyed ");
    }

}
