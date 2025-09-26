package api.errors;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ListOfNumbersDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    private final List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbersDemo() {
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
    }

    // exception specified for the method with throws keyword
    public void writeList() throws IndexOutOfBoundsException {

        // try-with-resources example
        try (PrintWriter out = new PrintWriter(new FileWriter("log.txt"))) {

            for (int i = 0; i < SIZE; i++) {
                // throws an IndexOutOfBoundsException from ArrayList class
                out.println("Value at " + i + " = " + list.get(i));
            }
        // catch Exception objects
        } catch (IndexOutOfBoundsException e) { // first handler checked if exception
            logger.info("IndexOutOfBoundsException /"
                    + e.getMessage());
        } catch (IOException e) { // second handler checked if exception
            logger.info("IOException /"
                    + e.getMessage());
        // executes code regardless of the exception
        } finally {
            logger.info("Try-with-resources done.");
        }
    }

    public static void main(String[] args) {
        ListOfNumbersDemo demo = new ListOfNumbersDemo();
        demo.writeList();
    }
}
