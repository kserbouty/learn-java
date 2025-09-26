package api.basics;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class ArithmeticDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        ArithmeticDemo demo = new ArithmeticDemo();
        String log;

        // additive operator (also used for concatenation)
        int result = 1 + 2;
        log = "1 + 2 = " + result + "\n";
        demo.logger.info(log);

        int originalResult = result;

        // substraction operator
        result = result - 1;
        log = originalResult + " - 1 = " + result + "\n";
        demo.logger.info(log);

        originalResult = result;

        // multiplication operator
        result = result * 2;
        log = originalResult + " * 2 = " + result + "\n";
        demo.logger.info(log);

        originalResult = result;

        // division operator
        result = result / 2;
        log = originalResult + " / 2 = " + result + "\n";
        demo.logger.info(log);

        originalResult = result;

        // remainder operator
        result = result + 8;
        log = originalResult + " + 8 = " + result + "\n";
        demo.logger.info(log);

        originalResult = result;

        result = result % 7;
        log = originalResult + " % 7 = " + result;
        demo.logger.info(log);
    }
}
