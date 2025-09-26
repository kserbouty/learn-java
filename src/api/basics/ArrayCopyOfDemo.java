package api.basics;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class ArrayCopyOfDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        ArrayCopyOfDemo demo = new ArrayCopyOfDemo();
        String log;

        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        // fewer lines with java.util.Arrays
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

        log = copyTo[0] + " " +
                copyTo[1] + " " +
                copyTo[2] + " " +
                copyTo[3] + " " +
                copyTo[4] + " " +
                copyTo[5] + " " +
                copyTo[6];

        demo.logger.info(log);
    }
}
