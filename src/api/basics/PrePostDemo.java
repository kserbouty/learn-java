package api.basics;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class PrePostDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        PrePostDemo demo = new PrePostDemo();
        String log;

        int i = 3;
        log = "Start script / " + i + "\n";
        demo.logger.info(log); // prints 4

        // increment (postfix)
        i++;
        log = "Increment (postfix) / " + i + "\n";
        demo.logger.info(log); // prints 4

        // increment (prefix)
        ++i;
        log = "Increment (prefix) / " + i + "\n";
        demo.logger.info(log); // prints 5

        // decrement (postfix)
        i--;
        log = "Decrement (postfix) / " + i + "\n";
        demo.logger.info(log); // prints 4

        // decrement (prefix)
        --i;
        log = "Decrement (prefix) / " + i + "\n";
        demo.logger.info(log); // prints 3
    }
}
