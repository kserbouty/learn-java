package api.lambdas;

/**
 * Lambda Expressions.
 * @param <T>
 */
@FunctionalInterface // one abstract method to be functional
public interface Supplier<T> { // suppliers does not take any arguments
    // but returns an object
    T get();
}
