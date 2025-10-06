package api.controls;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class ContinueDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        ContinueDemo demo = new ContinueDemo();
        String log;

        String search = "peter piper picked a " + "peck of pickled peppers";
        int max = search.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // continue without the letter p
            if (search.charAt(i) != 'p') {
                // skips the current iteration
                continue;
            }

            // counting the occurrences of the letter p
            numPs++;
        }

        log = "Found " + numPs + " p's in the string.";
        demo.logger.info(log);
    }
}
