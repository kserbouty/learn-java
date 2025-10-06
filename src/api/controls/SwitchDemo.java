package api.controls;

import java.util.logging.Logger;
import java.util.Random;

/**
 * Java Language Basics.
 */
class SwitchDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        SwitchDemo demo = new SwitchDemo();
        Random random = new Random();

        // random integer between 0 and 3
        int randomInt = random.nextInt(4);

        // switch expression
        String quarterLabel = switch (randomInt) {
            case 0 -> "Q1 - Winter";
            case 1 -> "Q2 - Spring";
            case 2 -> "Q3 - Summer";
            case 3 -> "Q4 - Autumn";
            default -> "Unknown quarter";
        };

        demo.logger.info(quarterLabel);
    }
}
