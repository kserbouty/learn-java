package oop.classes;

import java.util.logging.Logger;

/**
 * Classes and Objects.
 */
class AnonymousClass {

    Logger logger = Logger.getLogger(getClass().getName());

    interface HelloWorld {
        void greet();
        void greetSomeone(String someone);
    }

    void sayHello() {

        // local class example (as declaration)
        class EnglishGreeting implements HelloWorld {

            // custom field
            String name = "world";

            // implement greet
            public void greet() {
                greetSomeone(name);
            }

            // implement greetSomeone
            public void greetSomeone(String someone) {
                name = someone;
                String log = "Hello " + name;
                logger.info(log);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        // anonymous class example (as expression)
        HelloWorld frenchGreeting = new HelloWorld() { // instantiation statement

            // constructor is not allowed

            // implement greet from HelloWorld interface
            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            // implement greetSomeone from HelloWorld interface
            @Override
            public void greetSomeone(String someone) {
                String log = "Salut " + someone;
                logger.info(log);
            }
        };

        // class must represent an interface to implement or a class to extend
        HelloWorld spanishGreeting = new HelloWorld() {

            @Override
            public void greet() {
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                String log = "Hola, " + someone;
                logger.info(log);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Karim");
        spanishGreeting.greet();
    }

    public static void main(String[] args) {
        AnonymousClass app = new AnonymousClass();
        app.sayHello();
    }
}
