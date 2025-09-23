package oop.classes;

import java.util.logging.Logger;

/**
 * Inheritance.
 */
public class RectangleDemo extends GraphicObject {

    Logger logger = Logger.getLogger(getClass().getName());

    // subclass methods
    @Override
    void draw(int height, int width) {

        String log = "\n";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                log = log.concat("#"); // draw row in ASCII art
            }
            log = log.concat("\n"); // define row limit
        }

        logger.info(log);
    }

    // must provide implementation
    @Override
    void resize(int newHeight, int newWidth) {
        this.height = newHeight;
        this.width = newWidth;
    }

    public static void main(String[] args) {

        RectangleDemo demo = new RectangleDemo();

        demo.height = 3;
        demo.width = 5;
        demo.resize(demo.height, demo.width);
        demo.draw(demo.height, demo.width);

        demo.height = 5;
        demo.width = 7;
        demo.resize(demo.height, demo.width);
        demo.draw(demo.height, demo.width);
    }
}
