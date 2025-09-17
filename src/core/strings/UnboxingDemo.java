package core.strings;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * Numbers and Strings.
 */
public class UnboxingDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        UnboxingDemo demo = new UnboxingDemo();

        List<Double> list = new ArrayList<>();
        list.add(3.1416);    // Π is autoboxed through method invocation

        // unboxing through assignment
        double pi = list.getFirst(); // Π is unboxed to a primitive value
        String log = "pi = " + pi;
        demo.logger.info(log);
    }
}
