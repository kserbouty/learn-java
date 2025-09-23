package oop.interfaces;

import java.time.*;
import java.util.logging.Logger;

/**
 * Interfaces.
 */
public class TimeClientDemo implements TimeClient {

    Logger logger = Logger.getLogger(getClass().getName());

    private LocalDateTime dateAndTime;

    // constructor
    public TimeClientDemo() {
        // process the current date
        dateAndTime = LocalDateTime.now();
    }

    // classic implementation of the contract
    @Override
    public void setTime(int hour, int minute, int second) {
        // assign the current date parameter
        LocalDate currentDate = LocalDate.from(dateAndTime);
        // set the new time
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        // assign the new time as the current one
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }

    @Override
    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }

    // default ZonedDateTime already implemented

    public static void main(String[] args) {

        // logger
        TimeClientDemo demo = new TimeClientDemo();
        String log;

        // interface
        TimeClient myTimeClient = new TimeClientDemo();

        log = "Current time: " + myTimeClient.getLocalDateTime();
        demo.logger.info(log);

        // invoke ZonedDateTime without override
        log = "Time in Los Angeles: " +
                myTimeClient.getZonedDateTime("America/Los_Angeles").toString();
        demo.logger.info(log);

        // implemented method
        myTimeClient.setTime(23, 59, 59);

        log = "New time: " + myTimeClient.getLocalDateTime();
        demo.logger.info(log);
    }
}
