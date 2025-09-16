package oop.classes;

import java.util.Iterator;
import java.util.logging.Logger;
import java.util.NoSuchElementException;

/**
 * Classes and Objects.
 */
class DataStructureDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    // declare the size on an array
    private static final int SIZE = 15;

    // initialize an array
    private final int[] arrayOfInts = new int[SIZE];

    // constructor
    DataStructureDemo() {
        // fill the array with ascending inter values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    // print out values of even indices
    void printEven() {
        DataStructureIterator iterator = new EventIterator();
        while (iterator.hasNext()) {
            String log = "Even value / " + iterator.next() + " ";
            logger.info(log);
        }
    }

    // give methods to check, retrieve or move elements of an array
    interface DataStructureIterator extends Iterator<Integer> { }
    private class EventIterator implements DataStructureIterator {

        // start from the first index
        private  int nextIndex = 0;

        // check if the current element is the last
        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }

        // returns the next element in the iteration
        public Integer next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            Integer recValue = arrayOfInts[nextIndex];

            // get the next even element
            nextIndex += 2;

            return recValue;
        }
    }

    // launcher
    public static void main(String[] args) {
        DataStructureDemo ds = new DataStructureDemo();
        ds.printEven();
    }
}
