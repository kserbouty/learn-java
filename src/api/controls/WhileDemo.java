package api.controls;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class WhileDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args){

        WhileDemo demo = new WhileDemo();
        String log = null;

        int count = 1;

        // while > expression > statement(s)
        while (count < 11) { // infinite loop if always true
            log = "Count is " + count;
            count++;
        }

        demo.logger.info(log);
    }
}
