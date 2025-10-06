package oop.classes;

import java.util.logging.Logger;

/**
 * Classes and Objects.
 */
public class ShadowDemo {

    int member = 0;

    class FirstLevel {

        Logger logger = Logger.getLogger(getClass().getName());

        // declaration shadows the declaration of the enclosing scope
        int member = 1;

        void methodInFirstLevel() {

            String log = "FirstLevel = " + this.member + "\n";
            logger.info(log);

            log = "ShadowDemo = " + ShadowDemo.this.member;
            logger.info(log);
        }
    }

    public static void main(String... args) {
        ShadowDemo demo = new ShadowDemo();
        ShadowDemo.FirstLevel firstLevel = demo.new FirstLevel();
        firstLevel.methodInFirstLevel();
    }
}
