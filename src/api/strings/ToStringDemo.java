package api.strings;

import java.util.logging.Logger;

/**
 * Numbers and Strings.
 */
class ToStringDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        ToStringDemo demo = new ToStringDemo();
        String log;

        int i = 7;

        // conversion with concatenation
        String s1 = "Concatenation / " + i + "\n";
        demo.logger.info(s1);

        // conversion with valueOf()
        String s2 = String.valueOf(i);
        log = "String.valueOf / " + s2 + "\n";
        demo.logger.info(log);

        // conversion with toString()
        String s3 = Integer.toString(i);
        log = "String.toString / " + s3;
        demo.logger.info(log);
    }
}
