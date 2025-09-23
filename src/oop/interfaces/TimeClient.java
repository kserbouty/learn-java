package oop.interfaces;

import java.time.*;
import java.util.logging.Logger;

/**
 * Interfaces.
 */
public interface TimeClient {

    Logger logger = Logger.getLogger(TimeClient.class.getName());

    // contract
    void setTime(int hour, int minute, int second);
    LocalDateTime getLocalDateTime();

    // default method example
    static ZoneId getZoneId (String zone) { // static for helpers
        try {
            return ZoneId.of(zone);
        } catch (DateTimeException e) {
            logger.info("Invalid time zone: " + zone +
                    "; using default time zone instead.");
            return ZoneId.systemDefault();
        }
    }

    // should not trigger an error if not implemented
    default ZonedDateTime getZonedDateTime(String zone) {
        // return an instance of a ZonedDateTime object
        return ZonedDateTime.of(getLocalDateTime(), getZoneId(zone));
    }
}
