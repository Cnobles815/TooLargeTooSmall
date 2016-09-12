package nobles.christopher.TooLargeTooSmall;

import java.util.Scanner;

/**
 * Created by christophernobles on 9/10/16.
 */
public class Display {

    //Prompt the user for input
    //Take user input
    //Display answer
    public int getUserInput() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Guess.");
        return userInput.nextInt();

    }

    public void showResultHigh (String output) {
        System.out.println("Your guess was too " + output + "\nTry again scrub." );

    }

    public void showResultLow (String output) {
        System.out.println("Your guess was too " + output + "\nTry again scrub.");

    }

    public void showResultCorrect (String output) {
        System.out.println( output + " Lucky." );

    }

}
