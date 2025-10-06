package api.basics;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class ArrayCopyDemo {

    Logger logger = Logger.getLogger(getClass().getName());
    
    public static void main(String[] args) {

        ArrayCopyDemo demo = new ArrayCopyDemo();
        String log;
        
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom,2, copyTo, 0, 7);

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
