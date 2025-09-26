package api.numbers;

import java.util.logging.Logger;

/**
 * Numbers and Strings.
 */
class ExponentialDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        ExponentialDemo demo = new ExponentialDemo();
        String log;

        double x = 11.635;
        double y = 2.76;

        // base of the natural logarithms
        log = "The value of e is " + Math.E + "\n";
        demo.logger.info(log);

        // base of the natural logarithms, to the power of the argument x
        final String is = ") is ";
        log = "exp(" + x + is + Math.exp(x) + "\n";
        demo.logger.info(log);

        // natural logarithm of the argument x
        log = "log(" + x + is + Math.log(x) + "\n";
        demo.logger.info(log);

        // value of the first argument x raised to the power of the second argument y
        log = "pow(" + x + ", " + y + is + Math.pow(x, y) + "\n";
        demo.logger.info(log);

        // square root of the argument x

        log = "sqrt(" + x + is + Math.sqrt(x) + "\n";
        demo.logger.info(log);
    }
}
