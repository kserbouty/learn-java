package api.strings;

import java.util.logging.Logger;

/**
 * Numbers and Strings.
 */
class ValueOfDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        ValueOfDemo demo = new ValueOfDemo();
        String log;

        // require two parameters on the command line
        if (args.length == 2) {

            // more direct approach compared to floatValue()
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);

            // some arithmetic
            log = "a + b = " + (a + b) + "\n";
            demo.logger.info(log);

            log = "a - b = " + (a - b) + "\n";
            demo.logger.info(log);

            log = "a * b = " + (a * b) + "\n";
            demo.logger.info(log);

            log = "a / b = " + (a / b) + "\n";
            demo.logger.info(log);

            log = "a % b = " + (a % b);
            demo.logger.info(log);

        } else {
            demo.logger.info("This program requires two command-line parameters.");
        }
    }
}
