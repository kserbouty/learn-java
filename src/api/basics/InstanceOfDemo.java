package api.basics;

import java.util.logging.Logger;

/**
 * Java Language Basics.
 */
class InstanceOfDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        InstanceOfDemo demo = new InstanceOfDemo();
        String log;

        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        int cadence1 = obj1.cadence;
        int speed1 = obj1.speed;
        int gear1 = obj1.gear;
        log = "Parent specs / " + cadence1 + "-" + speed1 + "-" + gear1 + "\n";
        demo.logger.info(log);

        int cadence2 = obj2.cadence;
        int speed2 = obj2.speed;
        int gear2 = obj2.gear;
        log = "Child specs / " + cadence2 + "-" + speed2 + "-" + gear2 + "\n";
        demo.logger.info(log);

        // superclass
        log = "obj1 instanceof Parent / " + true + "\n";
        demo.logger.info(log);
        log = "obj1 instanceof Child / " + false + "\n";
        demo.logger.info(log);
        log = "obj1 instanceof MyInterface / " + false + "\n";
        demo.logger.info(log);

        // subclass with interface
        log = "obj2 instanceof Parent / " + true + "\n";
        demo.logger.info(log);
        log = "obj2 instanceof Child / " + true + "\n";
        demo.logger.info(log);
        log = "obj2 instanceof MyInterface / " + true;
        demo.logger.info(log);
    }
}
