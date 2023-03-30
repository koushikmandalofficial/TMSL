package vehicledemo;

import mypackage.Car;
import mypackage.Truck;
import mypackage.Vehicle;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car(4, 120, 5);
        Vehicle truck = new Truck(6, 80, 5000);

        System.out.println("Car information:");
        System.out.println("Wheels: " + car.getWheels());
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Passengers: " + ((Car) car).getPassengers());

        System.out.println("\nTruck information:");
        System.out.println("Wheels: " + truck.getWheels());
        System.out.println("Speed: " + truck.getSpeed());
        System.out.println("Load limit: " + ((Truck) truck).getLoadLimit());

        if (car.getSpeed() > truck.getSpeed()) {
            System.out.println("\nThe car is faster than the truck.");
        } else if (car.getSpeed() < truck.getSpeed()) {
            System.out.println("\nThe truck is faster than the car.");
        } else {
            System.out.println("\nThe car and truck are equally fast.");
        }
    }
}
