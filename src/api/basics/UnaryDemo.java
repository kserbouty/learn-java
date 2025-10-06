package api.basics;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class UnaryDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        UnaryDemo demo = new UnaryDemo();
        String log;

        // unary plus operator
        int result = 10;
        String message = "Result is ";
        log = message + result + ".\n";
        demo.logger.info(log);

        // decrement operator
        result--;
        log = message + result + " after decrementation.\n";
        demo.logger.info(log);

        // increment operator
        result++;
        log = message + result + " after incrementation.\n";
        demo.logger.info(log);

        // unary minus operator
        result = -result;
        log = message + result + " after inversion.\n";
        demo.logger.info(log);

        // logical complement operator (inverts a boolean)
        boolean success = false;
        message = "Result is ";
        log = message + success + ".\n";
        demo.logger.info(log);
        log = message + !success + " after inversion.";
        demo.logger.info(log);
    }
}
