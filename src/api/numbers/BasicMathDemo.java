package api.numbers;

import java.util.logging.Logger;

/**
 * Numbers and Strings.
 */
class BasicMathDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        BasicMathDemo demo = new BasicMathDemo();
        String log;

        double a = -191.635;
        double b = 43.74;

        // computing an absolute value
        log = "The absolute value of " + a + " is " + Math.abs(a) + "\n";
        demo.logger.info(log);

        // rounding a value
        log = "The ceiling value of " + b + " is " + Math.ceil(b) + "\n";
        demo.logger.info(log);
        log = "The floor of " + b + " is " + Math.floor(b);
        demo.logger.info(log);
    }
}
