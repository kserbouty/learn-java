package oop.classes;

import java.util.logging.Logger;

/**
 * Classes and Objects.
 */
public class CreateObjectDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    // static method belonging to the class (available without instance of the class)
    public static void main(String[] args) {

        // instantiate a class by allocating memory
        CreateObjectDemo demo = new CreateObjectDemo(); // new returns a reference
        String log;

        // create one point object
        Point origin = new Point(23, 94);

        // create four rectangle objects
        Rectangle rectOne = new Rectangle();
        Rectangle rectTwo = new Rectangle(origin);
        Rectangle rectThree = new Rectangle(100, 200);
        Rectangle rectFour = new Rectangle(origin, 100, 200);

        // reference an object's field (width)
        int rectWidth = rectOne.getWidth();
        log = "Width of rectOne: " + rectWidth + "\n";
        demo.logger.info(log);

        // own copy of the same instance fields
        int rectHeight = rectTwo.getHeight();
        log = "Height of rectTwo: " + rectHeight + "\n";
        demo.logger.info(log);

        log = "Area of rectThree: " + rectThree.getArea() + "\n";
        demo.logger.info(log);

        // set position
        rectFour.setOrigin(origin);

        // display position
        int positionX = rectFour.origin.getX();
        log = "X Position of rectFour: " + positionX;
        demo.logger.info(log);

        int positionY = rectFour.origin.getY();
        log = "Y Position of rectFour: " + positionY;
        demo.logger.info(log);

        // move rectangle
        rectFour.move(40, 72);

        // new position
        positionX = rectFour.origin.getX();
        log = "New X Position of rectFour: " + positionX;
        demo.logger.info(log);

        positionY = rectFour.origin.getY();
        log = "New Y Position of rectFour: " + positionY;
        demo.logger.info(log);

        // objects are now unreferenced for garbage collection
    }
}
