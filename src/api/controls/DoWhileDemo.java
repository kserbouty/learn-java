package api.controls;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class DoWhileDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args){

        DoWhileDemo demo = new DoWhileDemo();
        String log;

        int count = 1;

        // do > statements > while > expression
        do { // always executed at least once
            log = "Count is " + count;
            count++;
        } while (count < 11);

        demo.logger.info(log);
    }
}
