package mypackage;

public class Truck extends Vehicle {
    private int loadLimit;

    public Truck(int wheels, int speed, int loadLimit) {
        super(wheels, speed);
        this.loadLimit = loadLimit;
    }

    public int getLoadLimit() {
        return loadLimit;
    }

    public void setLoadLimit(int loadLimit) {
        this.loadLimit = loadLimit;
    }
}
