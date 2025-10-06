package oop.classes;

/**
 * Classes and Objects.
 */
public class Point {

    // not available publicly
    private int x;
    private int y;

    // one constructor
    public Point(int a, int b) {
        this.x = a;
        this.y = b;
    }

    // accessors for CreateObjectDemo
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
