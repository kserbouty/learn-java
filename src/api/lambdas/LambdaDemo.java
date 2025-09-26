package api.lambdas;

import java.util.logging.Logger;

/**
 * Lambda Expressions.
 */
public class LambdaDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    // implements a functional interface
    Supplier<String> supplier = () -> "Hello Duke!";

    public static void main(String[] args) {

        LambdaDemo demo = new LambdaDemo();

        // invoke methods from the interface
        demo.logger.info(demo.supplier.get());
    }
}
