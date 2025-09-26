package api.basics;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class BitDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        BitDemo demo = new BitDemo();
        String log;

        // unary bitwise
        int byte0 = 0b101010; // 0010 1010
        log = "Original / " + byte0 + "\n";
        demo.logger.info(log); // prints 42 (set for 2 digits)

        int byte1 = ~byte0; // 1101 0101 (0 and 1 inversion)
        log = "Inverted / " + byte1 + "\n";
        demo.logger.info(log); // prints -43 (set for 2 digits)

        // bitwise AND operator
        int bitmask = 0x000F;
        int val = 0x2222;
        int result = val & bitmask;
        log = "val & bitmask = " + result;
        demo.logger.info(log); // prints "2"
    }
}
