package api.generics;

/**
 * Generics.
 */
public record OrderedPairDemo<K, V>(K key, V value) implements Pair<K, V> {

    public static void main(String[] args) {

        GenericDemo<String> demo = new GenericDemo<>();
        String log;

        // instantiate K as a String, V as an Integer
        OrderedPairDemo<String, Integer> p1 = new OrderedPairDemo<>("Even", 8);

        String key1 = p1.key();
        int value1 = p1.value();
        log = "Pair<String, Integer> / " + key1 + ", " + value1 + "\n";

        demo.logger.info(log);

        // instantiate K and V as a String
        OrderedPairDemo<String, String> p2 = new OrderedPairDemo<>("Hello", "World");

        String key2 = p2.key();
        String value2 = p2.value();
        log = "Pair<String, String> / " + key2 + ", " + value2;
        demo.logger.info(log);
    }
}
