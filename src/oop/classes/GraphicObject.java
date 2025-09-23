package oop.classes;

/**
 * Inheritance.
 */
abstract class GraphicObject { // similar to interfaces

    // but can declare fields
    int height = 0;
    int width = 0;

    // and methods shared in subclasses

    // then different implementations with shapes
    abstract void draw(int height, int width);
    abstract void resize(int height, int width);
}
