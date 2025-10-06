package api.strings;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * Numbers and Strings.
 */
class AutoboxingDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        AutoboxingDemo demo = new AutoboxingDemo();
        String log;

        // autoboxing example, primitive type to wrapper class
        List<Integer> ints = new ArrayList<>();

        for (int i = 1; i < 10; i += 2) // no braces needed if only one statement
            ints.add(i); // create an Integer object from i

        for (int element : ints) {
            log = "Element from ints / " + element + "\n";
            demo.logger.info(log);
        }
    }
}
