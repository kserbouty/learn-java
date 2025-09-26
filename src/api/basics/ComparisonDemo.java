package api.basics;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class ComparisonDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        ComparisonDemo demo = new ComparisonDemo();
        String log;

        // used for equality and relational operators
        int value1 = 1;
        int value2 = 2;

        // value1 not equal to value2
        log = value1 + " != " + value2 + "\n";
        demo.logger.info(log);

        // value1 less than value2
        log = value1 + " < " + value2 + "\n";
        demo.logger.info(log);

        // value1 less than or equal to value2
        log = value1 + " <= " + value2;
        demo.logger.info(log);
    }
}
