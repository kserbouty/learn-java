package api.basics;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class LogicalDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        LogicalDemo demo = new LogicalDemo();
        String log;

        // used for conditional operators
        int value1 = 1;
        int value2 = 2;

        // (value1 == 1) && (value2 == 2)
        log = "value1 is " + value1 + " AND value2 is " + value2 + "\n";
        demo.logger.info(log);

        // (value1 == 1) || (value2 == 1)
        log = "value1 is " + value1 + " OR value2 is " + value2;
        demo.logger.info(log);
    }
}
