package core.numbers;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Numbers and Strings.
 */
class RandomDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        BasicMathDemo demo = new BasicMathDemo();
        String log;

        Random random = new Random();
        int number = random.nextInt(11);

        log = "Random integer / " + number;
        demo.logger.info(log);
    }
}
