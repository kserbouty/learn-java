package api.strings;

import java.util.logging.Logger;

/**
 * Numbers and Strings.
 */
class StringBuilderDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        StringBuilderDemo demo = new StringBuilderDemo();

        // initialize a palindrome
        String palindrome = "Dot saw I was Tod";
        int length = palindrome.length();

        // allocate memory with the string length
        char[] tempArray = new char[length];
        char[] reverseArray = new char[length];

        // put the palindrome in an array of chars
        for (int i = 0; i < length; i++) {
            tempArray[i] = palindrome.charAt(i);
        }

        // reverse array of chars
        for (int j = 0; j < length; j++) {
            // start from the last index
            // increase minus to match the first index
            reverseArray[j] = tempArray[length - 1 - j];
        }

        // converts back to a string
        String reversePalindrome = new String(reverseArray);
        demo.logger.info(reversePalindrome); // doT saw I was toD
    }
}
