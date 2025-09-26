package api.controls;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class ForDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        ForDemo demo = new ForDemo();
        String log;

        // for > initialization > termination > increment > statement(s)
        for (int i = 1 ; i < 11; i++) {
            log = "Count is " + i;
            demo.logger.info(log);
        }

        // Expressions are optional:
        // Infinite loop : for > ; > ; > ; >statement(s)
    }
}
