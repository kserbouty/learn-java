package api.notations;

import java.util.logging.Logger;

// provides metadata
@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    String[] reviewers();
}

// no direct effect on the operation of the code
@ClassPreamble(
        author = "John Doe",
        date = "3/17/2002",
        currentRevision = 6,
        lastModified = "4/12/2004",
        lastModifiedBy = "Jane Doe",
        reviewers = {"Alice", "Bob", "Cindy"}
)
class ClassPreambleDemo {

    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {

        ClassPreambleDemo demo = new ClassPreambleDemo();

        demo.logger.info("Hello World!");
    }
}
