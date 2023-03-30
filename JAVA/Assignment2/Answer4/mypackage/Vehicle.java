package mypackage;

public class Vehicle {
    private int wheels;
    private int speed;

    public Vehicle(int wheels, int speed) {
        this.wheels = wheels;
        this.speed = speed;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
