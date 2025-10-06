package oop.classes;

/**
 * Classes and Objects.
 */
class TopLevelClass {
    void accessMembers(OuterClassDemo outer) {
        String log = "Top-level class / "
                + outer.outerField + ", "
                // access package-private class
                + OuterClassDemo.staticOuterField;
        outer.logger.info(log);
    }
}
