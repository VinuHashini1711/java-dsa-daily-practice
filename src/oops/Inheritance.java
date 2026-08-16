package oops;

public class Inheritance {
    class Animal {
        void eat() {
            System.out.println("Eating");
        }
    }

    public static final class Dog extends Animal {
        void bark() {
            System.out.println("Barking");
        }
    }


        public static void main(String[] args) {
            Dog d = new Dog();

            d.eat();   // inherited method
            d.bark();  // own method
}
}