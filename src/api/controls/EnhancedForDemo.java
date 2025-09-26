package api.controls;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class EnhancedForDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args){

        EnhancedForDemo demo = new EnhancedForDemo();
        String log;

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // designed to iterate through Collections
        for (int item : numbers) {
            log = "Count is " + item; // item holds the current value
            demo.logger.info(log);
        }
    }
}
