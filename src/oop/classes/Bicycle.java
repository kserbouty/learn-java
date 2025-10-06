package oop.classes;

/**
 * Classes and Objects.
 */
public class Bicycle {

    // fields (state)
    private int cadence;
    private int speed;
    private int gear;

    // constructor(s) (public access)
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        this.gear = startGear;
        this.cadence = startCadence;
        this.speed = startSpeed;
    }

    // method declarations (behavior)
    public void setCadence(int newValue) {
        this.cadence = newValue;
    }

    public void setGear(int newValue) {
        this.gear = newValue;
    }

    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }

    // encapsulation made with private fields
    public int getCadence() {
        return this.cadence;
    }

    public int getGear() {
        return this.gear;
    }

    public int getSpeed() {
        return this.speed;
    }
}
