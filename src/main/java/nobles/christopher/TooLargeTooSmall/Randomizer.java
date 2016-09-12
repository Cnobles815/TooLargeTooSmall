package nobles.christopher.TooLargeTooSmall;
import java.util.Random;

/**
 * Created by christophernobles on 9/10/16.
 */
public class Randomizer {

     public int setRandom() {
        Random secretNum = new Random();

        int value = secretNum.nextInt(10);

        return value;

    }
}
