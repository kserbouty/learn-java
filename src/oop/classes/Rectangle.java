package oop.classes;

/**
 * Classes and Objects.
 */
public class Rectangle {

    private int height = 0;
    private int width = 0;
    Point origin; // package-private (no explicit modifier)

    // four constructors
    public Rectangle() {
        this.origin = new Point(0, 0);
    }

    public Rectangle(Point point) {
        this.origin = point;
    }

    public Rectangle(int w, int h) {
        this.origin = new Point(0, 0);
        this.width = w;
        this.height = h;
    }

    public Rectangle(Point point, int w, int h) {
        this.origin = point;
        this.width = w;
        this.height = h;
    }

    // move the rectangle
    public void move(int x, int y) {
        this.origin.setX(x);
        this.origin.setY(y);
    }

    // compute the area of the rectangle
    public int getArea() {
        return this.width * this.height;
    }

    // accessors for CreateObjectDemo
    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }
}
