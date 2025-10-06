package api.controls;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class BreakDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        BreakDemo demo = new BreakDemo();
        String log;

        int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        int target = 12;
        int i;
        boolean isFound = false;

        // targeting number 12
        for (i = 0; i < arrayOfInts.length; i++) {
            // checking result with target number
            if (arrayOfInts[i] == target) {
                isFound = true;
                // breaking the innermost statement
                break;
            }
        }

        if (isFound) {
            log = "Found " + target + " at index " + i;
            demo.logger.info(log);
        } else {
            log = target + " not in the array";
            demo.logger.info(log);
        }
    }
}
