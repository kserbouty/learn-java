package api.generics;

import java.util.logging.Logger;

/**
 * Generics.
 * @param <T> the type of the value being boxed
 */
class GenericDemo<T> {

    Logger logger = Logger.getLogger(getClass().getName());

    // generic fields, T stands for Type by convention
    private T t; // compile-time error for primitive values

    // generic methods, accept type parameters
    public void set(T t) { this.t = t; }
    public T get() { return t; }

    public static void main(String[] args) {

        // generic type invocation, replacing T with Integer
        GenericDemo<Integer> genericInt = new GenericDemo<>(); // diamond syntax

        genericInt.set(1);
        int value = genericInt.get();

        String log = "Generic integer / " + value;
        genericInt.logger.info(log);
    }
}
