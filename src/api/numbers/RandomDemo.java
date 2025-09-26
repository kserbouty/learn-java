package api.numbers;

import java.util.Random;

/**
 * Numbers and Strings.
 */
class RandomDemo {

    public static void main(String[] args) {

        BasicMathDemo demo = new BasicMathDemo();
        String log;

        Random random = new Random();
        int number = random.nextInt(11);

        log = "Random integer / " + number;
        demo.logger.info(log);
    }
}
