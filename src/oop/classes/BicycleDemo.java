package oop.classes;

import java.util.logging.Logger;

/**
 * Classes and Objects.
 */
class BicycleDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        // default (no-argument constructor)
        BicycleDemo demo = new BicycleDemo();
        String log;

        // create objects (invoke constructor)
        Bicycle bike = new Bicycle(0,0,0);
        MountainBike mountainBike = new MountainBike(10, 2, 2, 2);

        // invoke methods
        bike.setCadence(1);
        bike.setGear(1);
        bike.speedUp(1);

        int cadence = bike.getCadence();
        int gear = bike.getGear();
        int speed = bike.getSpeed();
        log = "Parent fields / " + cadence + "-" + gear + "-" + speed + "\n";
        demo.logger.info(log);

        mountainBike.setHeight(15);
        mountainBike.setCadence(1);
        mountainBike.setGear(1);
        mountainBike.applyBrake(1);

        int height = mountainBike.getHeight();
        cadence = mountainBike.getCadence();
        gear = mountainBike.getGear();
        speed = bike.getSpeed();
        log = "Child fields / " + height + "-" + cadence + "-" + gear + "-" + speed;
        demo.logger.info(log);
    }
}
