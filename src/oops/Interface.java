package oops;
public class Interface {
    interface Switchable {
        void turnOn();   // abstract method
        void turnOff();
    }
    static class Fan implements Switchable {
        @Override
        public void turnOn() {
            System.out.println("Fan is ON");
        }
        @Override
        public void turnOff() {
            System.out.println("Fan is OFF");
        }
    }
    static class Light implements Switchable {
        @Override
        public void turnOn() {
            System.out.println("Light is ON");
        }
        @Override
        public void turnOff() {
            System.out.println("Light is OFF");
        }
    }
        public static void main(String[] args) {
            Switchable fan = new Fan();
            fan.turnOn();
            fan.turnOff();

            Switchable light = new Light();
            light.turnOn();
            light.turnOff();
        }
    }
