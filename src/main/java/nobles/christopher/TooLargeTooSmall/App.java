package nobles.christopher.TooLargeTooSmall;

/**
 * Created by christophernobles on 9/10/16.
 */
public class App {


    public static void main(String[] args){
        Brain start = new Brain();
        while(start.compare() == 1){
            start.compare();
        }

    }
}

