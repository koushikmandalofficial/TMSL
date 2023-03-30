package mypackage;

public class Car extends Vehicle {
    private int passengers;

    public Car(int wheels, int speed, int passengers) {
        super(wheels, speed);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
