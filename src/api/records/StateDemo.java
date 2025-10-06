package api.records;

import java.util.logging.Logger;

/**
 * Using Record to Model Immutable Data.
 */
public class StateDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        StateDemo demo = new StateDemo();
        String log;

        // use the second constructor
        State stateCity = new State("France", "Paris");
        // read fields with accessors made by the compiler
        log = "City name / " + stateCity.name() + "\n";
        demo.logger.info(log);
        log = "City capital / " + stateCity.capitalCity();
        demo.logger.info(log);
    }
}
