package api.basics;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class ConcatDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        ConcatDemo demo = new ConcatDemo();
        String log;

        String firstString = "This is";
        String secondString = " a concatenated string.";
        log = firstString + secondString;
        demo.logger.info(log);
    }
}
