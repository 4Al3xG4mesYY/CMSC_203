package stuff;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Description: (A color guessing game)
 * Due: 02/17/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Alexander Nguyen
 */

public class ESPGame {

    public static void main(String[] args) throws FileNotFoundException {
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        final String COLOR_BLACK = "black", COLOR_WHITE = "white", COLOR_GRAY = "gray", COLOR_SILVER = "silver",
                COLOR_MAROON = "maroon", COLOR_RED = "red", COLOR_PURPLE = "purple", COLOR_FUCHSIA = "fuchsia",
                COLOR_GREEN = "green", COLOR_LIME = "lime", COLOR_OLIVE = "olive", COLOR_YELLOW = "yellow",
                COLOR_NAVY = "navy", COLOR_BLUE = "blue", COLOR_TEAL = "teal", COLOR_AQUA = "aqua";
        String guess, secret, filename, userName, userDescription, dueDate;
        int option, correctGuesses = 0;
        boolean exit = false;  // to control the menu loop
        
        // Main game loop
        do {
            System.out.println("CMSC203 Assignment1: Test your ESP skills!");
            System.out.println("Welcome to ESP - extrasensory perception!");
            System.out.println("Would you please choose one of the 4 options from the menu:");

            System.out.println("\n\t1- read and display on the screen first 16 names of colors "
                    + "from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("\t2- read and display on the screen first 10 names of colors "
                    + "from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("\t3- read and display on the screen first 5 names of colors "
                    + "from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("\t4- Exit from the program");

            System.out.print("Enter the option: ");
            option = keyboard.nextInt();
            keyboard.nextLine();

            switch(option) {
                case 1:
                    System.out.println("1 " + COLOR_BLACK);
                    System.out.println("2 " + COLOR_WHITE);
                    System.out.println("3 " + COLOR_GRAY);
                    System.out.println("4 " + COLOR_SILVER);
                    System.out.println("5 " + COLOR_MAROON);
                    System.out.println("6 " + COLOR_RED);
                    System.out.println("7 " + COLOR_PURPLE);
                    System.out.println("8 " + COLOR_FUCHSIA);
                    System.out.println("9 " + COLOR_GREEN);
                    System.out.println("10 " + COLOR_LIME);
                    System.out.println("11 " + COLOR_OLIVE);
                    System.out.println("12 " + COLOR_YELLOW);
                    System.out.println("13 " + COLOR_NAVY);
                    System.out.println("14 " + COLOR_BLUE);
                    System.out.println("15 " + COLOR_TEAL);
                    System.out.println("16 " + COLOR_AQUA);
                    break;
                case 2:
                    System.out.println("1 " + COLOR_BLACK);
                    System.out.println("2 " + COLOR_WHITE);
                    System.out.println("3 " + COLOR_GRAY);
                    System.out.println("4 " + COLOR_SILVER);
                    System.out.println("5 " + COLOR_MAROON);
                    System.out.println("6 " + COLOR_RED);
                    System.out.println("7 " + COLOR_PURPLE);
                    System.out.println("8 " + COLOR_FUCHSIA);
                    System.out.println("9 " + COLOR_GREEN);
                    System.out.println("10 " + COLOR_LIME);
                    break;
                case 3:
                    System.out.println("1 " + COLOR_BLACK);
                    System.out.println("2 " + COLOR_WHITE);
                    System.out.println("3 " + COLOR_GRAY);
                    System.out.println("4 " + COLOR_SILVER);
                    System.out.println("5 " + COLOR_MAROON);
                    break;
                case 4:
                    System.out.println("Exiting the game.");
                    System.exit(0);  // Exit the program
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    continue;  // Loop again if invalid option is entered
            }

            // Ask for the file name to write colors to
            System.out.println("Enter the filename to save the color list: ");
            filename = keyboard.nextLine();
            PrintWriter outputfile = new PrintWriter(filename);
            outputfile.println("1 " + COLOR_BLACK);
            outputfile.println("2 " + COLOR_WHITE);
            outputfile.println("3 " + COLOR_GRAY);
            outputfile.println("4 " + COLOR_SILVER);
            outputfile.println("5 " + COLOR_MAROON);
            outputfile.println("6 " + COLOR_RED);
            outputfile.println("7 " + COLOR_PURPLE);
            outputfile.println("8 " + COLOR_FUCHSIA);
            outputfile.println("9 " + COLOR_GREEN);
            outputfile.println("10 " + COLOR_LIME);
            outputfile.println("11 " + COLOR_OLIVE);
            outputfile.println("12 " + COLOR_YELLOW);
            outputfile.println("13 " + COLOR_NAVY);
            outputfile.println("14 " + COLOR_BLUE);
            outputfile.println("15 " + COLOR_TEAL);
            outputfile.println("16 " + COLOR_AQUA);
            outputfile.close();

            correctGuesses = 0;  // Reset guesses for each game round
            for (int i = 1; i <= 3; i++) {
                int randomColorIndex = rand.nextInt(16) + 1;
                switch (randomColorIndex) {
                    case 1: secret = COLOR_BLACK; break;
                    case 2: secret = COLOR_WHITE; break;
                    case 3: secret = COLOR_GRAY; break;
                    case 4: secret = COLOR_SILVER; break;
                    case 5: secret = COLOR_MAROON; break;
                    case 6: secret = COLOR_RED; break;
                    case 7: secret = COLOR_PURPLE; break;
                    case 8: secret = COLOR_FUCHSIA; break;
                    case 9: secret = COLOR_GREEN; break;
                    case 10: secret = COLOR_LIME; break;
                    case 11: secret = COLOR_OLIVE; break;
                    case 12: secret = COLOR_YELLOW; break;
                    case 13: secret = COLOR_NAVY; break;
                    case 14: secret = COLOR_BLUE; break;
                    case 15: secret = COLOR_TEAL; break;
                    case 16: secret = COLOR_AQUA; break;
                    default: secret = COLOR_BLACK;  // Default case, shouldn't occur
                }

                System.out.println("\nRound " + i);
                System.out.println("I am thinking of a color.");
                System.out.println("Is it one of the colors from the list?");
                System.out.print("Enter your guess: ");
                guess = keyboard.nextLine();

                // Check if the guess is correct
                if (guess.equalsIgnoreCase(secret)) {
                    correctGuesses++;
                    System.out.println("Correct! I was thinking of " + secret);
                } else {
                    System.out.println("Wrong! I was thinking of " + secret);
                }
            }

            // Game Over, Show Results
            System.out.println("Game Over");
            System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");

            // Collect user details
            System.out.print("Enter your name: ");
            userName = keyboard.nextLine();
            System.out.print("Describe yourself: ");
            userDescription = keyboard.nextLine();
            System.out.print("Due Date: ");
            dueDate = keyboard.nextLine();

            String results = "Game Over\n" +
                             "You guessed " + correctGuesses + " out of 3 colors correctly.\n" +
                             "Due Date: " + dueDate + "\n" +
                             "Username: " + userName + "\n" +
                             "User Description: " + userDescription + "\n" +
                             "Date: " + dueDate;

            System.out.println(results);

            // Write the results to the file
            PrintWriter outputfile2 = new PrintWriter("EspGameResults.txt");
            outputfile2.println(results);
            outputfile2.close();

            // Ask if the user wants to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgain = keyboard.nextLine();
            if (!playAgain.equalsIgnoreCase("yes")) {
                exit = true;  // Exiting the game
            }
        } while (!exit);  // Loop the game until the user chooses not to play again
    }
}
