package api.strings;

import java.util.logging.Logger;

/**
 * Numbers and Strings.
 */
class StringDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        StringDemo demo = new StringDemo();
        String log;

        // primitive character type
        char ch = 'a';
        log = "Primitive character / " + ch + "\n";
        demo.logger.info(log);

        // string object
        String greetings = "Hello world!";
        log = "String object / " + greetings + "\n";
        demo.logger.info(log);

        // string from a constructor
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o' };
        String helloString = new String(helloArray);
        log = "String from an array / " + helloString + "\n";
        demo.logger.info(log);

        // string length
        log = "String length / " + helloString.length() + "\n";
        demo.logger.info(log);

        // concatenation of two strings
        String string1 = "Hello";
        String string2 = " world!";
        log = "Concatenation / " + string1.concat(string2) + "\n";
        demo.logger.info(log);

        // concat() with literals
        String string3 = "My name is ".concat("Karim");
        log = "Literals / " + string3;
        demo.logger.info(log);
    }
}
