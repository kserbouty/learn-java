package api.records;

import java.util.List;

/**
 * Using Record to Model Immutable Data.
 */
public record State(String name, String capitalCity, List<String> cities) { // extends java.lang.Record

    // toString(), equals() and hashCode() methods available if needed

    // ensure that data is immutable
    public State {
        cities = List.copyOf(cities); // does not accepts null values
    }

    // take only the name and capital of a city
    public State(String name, String capitalCity) {
        // redefining the canonical constructor with this()
        this(name, capitalCity, List.of());
    }
}
