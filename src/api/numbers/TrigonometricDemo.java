package api.numbers;

/**
 * Numbers and Strings.
 */
class TrigonometricDemo {

    public static void main(String[] args) {

        BasicMathDemo demo = new BasicMathDemo();
        String log;

        double degrees = 45.0;
        double radians = Math.toRadians(degrees);
        String is = " degrees is ";

        // double value that is closer than any other to pi (π)
        log = "The value of pi is " + Math.PI + "\n";
        demo.logger.info(log);

        // sine of a specified double value
        log = "The sine of " + degrees + is + Math.sin(radians) + "\n";
        demo.logger.info(log);

        // cosine of a specified double value
        log = "The cosine of " + degrees + is + Math.cos(radians) + "\n";
        demo.logger.info(log);

        // tangent of a specified double value
        log = "The tangent of " + degrees + is + Math.tan(radians);
        demo.logger.info(log);

    }
}
