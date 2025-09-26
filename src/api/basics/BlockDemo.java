package api.basics;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class BlockDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        // object creation statement
        BlockDemo demo = new BlockDemo();
        String log;

        // declaration statement
        double value = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;

        // assignment statement
        log = "Value / " + value + "\n"; // value != 1

        // method invocation statement
        demo.logger.info(log);

        // increment statement
        value++;
        log = "Incremented / " + value; // prints 2.0
        demo.logger.info(log);
    }
}
