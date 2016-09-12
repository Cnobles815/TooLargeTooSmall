package nobles.christopher.TooLargeTooSmall;
import java.util.Random;

/**
 * Created by christophernobles on 9/10/16.
 */
public class Brain {

    Display display;
    Calculator calculator;
    Randomizer random;

    public Brain(){

        this.display = new Display();
        this.calculator = new Calculator();
        this.random = new Randomizer();


    }

    public int again = 0;

    public int compare() {


        int userInput1 = display.getUserInput();
        int secret1 = random.setRandom();


        if (userInput1 > secret1)
            display.showResultHigh("high.");
            again = 0;


        if (userInput1 < secret1)
            display.showResultLow("low.");
            again = 0;


        if (userInput1 == secret1)
            display.showResultCorrect("You're on the money.");
            again = 1;

        return again;

    }

}
