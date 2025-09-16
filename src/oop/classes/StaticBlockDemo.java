package oop.classes;

import java.util.logging.Logger;

/**
 * Classes and Objects.
 */
public class StaticBlockDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    // class variables (fields)
    static int[] initial;

    // initializing fields
    static {
        // simple initialization
        initial = new int[10];

        // adding logic with loops or exceptions
        for (int i = 0; i < initial.length; i++) {
            initial[i] = i;
        }
    }

    public static void main(String[] args) {

        StaticBlockDemo demo = new StaticBlockDemo();
        String log;

        for (int element : initial) {
            log = "Index & Value / " + element + "\n";
            demo.logger.info(log);
        }
    }
}
