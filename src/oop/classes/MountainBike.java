package oop.classes;

/**
 * Classes and Objects.
 */
public class MountainBike extends Bicycle { // class limited to one parent

    private int seatHeight;

    // inherits all the fields
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        this.seatHeight = startHeight;
    }

    // inherits all methods
    public void setHeight(int newValue) {
        this.seatHeight = newValue;
    }

    public int getHeight() {
        return this.seatHeight;
    }
}
