package api.basics;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class ArrayDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        ArrayDemo demo = new ArrayDemo();
        String log;

        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        log = "\nElement at index 0: "
                + anArray[0] +
                "\nElement at index 1: "
                + anArray[1] +
                "\nElement at index 2: "
                + anArray[2] +
                "\nElement at index 3: "
                + anArray[3] +
                "\nElement at index 4: "
                + anArray[4] +
                "\nElement at index 5: "
                + anArray[5] +
                "\nElement at index 6: "
                + anArray[6] +
                "\nElement at index 7: "
                + anArray[7] +
                "\nElement at index 8: "
                + anArray[8] +
                "\nElement at index 9: "
                + anArray[9];
        demo.logger.info(log);
    }
}
