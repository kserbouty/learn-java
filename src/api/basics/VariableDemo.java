package api.basics;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class VariableDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    // instance variables (non-static fields)
    int cadence = 0;
    int speed = 0;

    // class variables (static fields)
    static final int NUM_GEARS = 6;

    // parameters (args variable)
    public static void main(String[] args) {

        // local variables
        VariableDemo demo = new VariableDemo();
        String log;

        // instance and class variables
        int currentCadence = demo.cadence;
        int currentSpeed = demo.speed;
        log = "Instance and class variables / " +
                currentCadence + " (cadence) " +
                currentSpeed + " (speed) " +
                VariableDemo.NUM_GEARS + " (gears) \n";
        demo.logger.info(log);

        // support for character strings with java.lang.String
        log = "Strings / This is a string.\n";
        demo.logger.info(log);

        // literals (fixed value)
        boolean result = true; // ~1 bit
        byte b = 100; // 8-bit
        char capitalC = 'C'; // 16-bit
        short s = 10000; // 16-bit
        int i = 100000; // 32-bit
        log = "Primitives / " +
                result + " (boolean) " +
                b + " (byte) " +
                capitalC + " (char) " +
                s + " (short) " +
                i + " (int) \n";
        demo.logger.info(log);

        // numeral systems
        int binaryValue = 0b101010; // prefix 0b indicates binary
        int decimalValue = 42;
        int hexadecimalValue = 0x2a; // prefix 0x indicates hex
        log = "Numeral systems / " +
                binaryValue + " (base 2) " +
                decimalValue + " (base 10) " +
                hexadecimalValue + " (base 16) \n";
        demo.logger.info(log);

        // floating point types
        double d1 = 123.4;
        double d2 = 123.4d; // letter d
        double d3 = 123.4D; // letter D
        double d4 = 1.234e2; // scientific notation
        log = "Double literals / " +
                d1 + " = " +
                d2 + " = " +
                d3 + " = " +
                d4 + "\n";
        demo.logger.info(log);
        float f1 = 123.4f; // letter f
        float f2 = 123.4F; // letter F
        log = "Floating-point literals / " +
                f1 + " = " +
                f2 + "\n";
        demo.logger.info(log);

        // underscore characters
        float pi = 3.14_15F;
        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        log = "Underscore characters / " +
                pi + " (pi) " +
                creditCardNumber + " (credit) " +
                socialSecurityNumber + " (social)";
        demo.logger.info(log);
    }
}
