package oops;

public class AbstractClass {

    static abstract class Vehicle {

        int speed;

        Vehicle(int speed) {
            this.speed = speed;
        }

        void start() {
            System.out.println("Vehicle started");
        }

        void stop() {
            System.out.println("Vehicle stopped");
        }

        abstract void move();
    }

    static class Car extends Vehicle {

        Car(int speed) {
            super(speed);
        }

        @Override
        void move() {
            System.out.println("Car is moving at " + speed + " km/h");
        }
    }

    static class Bike extends Vehicle {

        Bike(int speed) {
            super(speed);
        }

        @Override
        void move() {
            System.out.println("Bike is moving at " + speed + " km/h");
        }
    }

    public static void main(String[] args) {

        Car car = new Car(100);
        car.start();
        car.move();
        car.stop();

        Bike bike = new Bike(60);
        bike.start();
        bike.move();
        bike.stop();
    }

}