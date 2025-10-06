package api.basics;

import java.util.List;
import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
public class VarTypeDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        VarTypeDemo demo = new VarTypeDemo();

        // var type identifier since Java SE 10
        var message = "Hello world! \n";
        demo.logger.info(message);

        // restricted for local variables
        var list = List.of("one", "two", "three", "four");

        for (var element : list) {
            demo.logger.info(element);
        }
    }
}
