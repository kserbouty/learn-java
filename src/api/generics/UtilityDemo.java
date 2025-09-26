package api.generics;

import java.util.logging.Logger;

/**
 * Generics.
 */
class UtilityDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    // compare two values
    static <K, V> boolean compare(
            OrderedPairDemo<K, V> p1,
            OrderedPairDemo<K, V> p2) {
        // return true if keys p1 and p2 are the same
        return p1.key().equals(p2.key()) &&
                p1.value().equals(p2.value());
    }

    public static void main(String[] args) {

        UtilityDemo demo = new UtilityDemo();
        String log;

        // type inference used to determine the arguments in <> (diamond)
        OrderedPairDemo<Integer, String> p1 = new OrderedPairDemo<>(1, "apple");
        OrderedPairDemo<Integer, String> p2 = new OrderedPairDemo<>(2, "pear");
        boolean same = UtilityDemo.compare(p1, p2);

        log = "Comparison p1 & p2 / " + same + "\n"; // false
        demo.logger.info(log);

        OrderedPairDemo<Integer, String> p3 = new OrderedPairDemo<>(1, "lemon");
        OrderedPairDemo<Integer, String> p4 = new OrderedPairDemo<>(1, "lemon");
        same = UtilityDemo.compare(p3, p4);

        log = "Comparison p3 & p4 / " + same; // true
        demo.logger.info(log);
    }
}
