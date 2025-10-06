package oop.classes;

import java.util.logging.Logger;

/**
 * Classes and Objects.
 */
class OuterClassDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    // fields
    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    // nested class named differently, non-static category
    class InnerClass {
        void accessMembers() {
            // have access to other members
            String log = "Inner class / "
                            + outerField + ", "
                            + staticOuterField + "\n";
            logger.info(log);
        }
    }

    // top-level class nested in another top-level class
    static class StaticNestedClass {
        void accessMembers(OuterClassDemo outer) {
            String log = "Static nested class / "
                            // needs an instantiation
                            + outer.outerField + ", "
                            + staticOuterField + "\n";
            outer.logger.info(log);
        }
    }

    public static void main(String[] args) {

        // outer class needed to instantiate an inner class
        OuterClassDemo outerObject = new OuterClassDemo();
        // create the inner object within the outer object
        OuterClassDemo.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        // same behavior between static nested and top-level class
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        staticNestedClass.accessMembers(outerObject);

        TopLevelClass topLevelObject = new TopLevelClass();
        topLevelObject.accessMembers(outerObject);
    }
}
