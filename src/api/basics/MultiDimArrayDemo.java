package api.basics;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class MultiDimArrayDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        MultiDimArrayDemo demo = new MultiDimArrayDemo();
        String log;

        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };

        // Mr. Smith
        log = names[0][0] + names[1][0] + "\n";
        demo.logger.info(log);

        // Ms. Jones
        log = names[0][2] + names[1][1];
        demo.logger.info(log);
    }
}
