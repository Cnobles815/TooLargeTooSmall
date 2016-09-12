package nobles.christopher.TooLargeTooSmall;

/**
 * Created by christophernobles on 9/10/16.
 */
public class Calculator {

    int sum = 0;

    public int calculate (int userNum) {
        for ( int x = 1 ; x <= userNum; x++ ) {
            sum += x;
        }

        return sum;



    }

}
