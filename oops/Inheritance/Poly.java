package oops.Inheritance;
public class Poly {

//This is static polymorphism or method overloading
    static class Vehicle {

        public void run() {
            System.out.println("Vehicle is running");
        }
    }

    static class Car extends Vehicle {

        public void run() {
            System.out.println("Car is running");
        }
    }

    static class Bus extends Vehicle {

        public void run() {
            System.out.println("Bus is running");
        }
    }

    static class Bike extends Vehicle {

        public void run() {
            System.out.println("Bike is running");
        }

    }

// Dynamic polymorphism or method overriding 
    public static class DynamicPoly extends Vehicle {

        public void run() {
            System.out.println("My Vehicle is running , overriding");
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {new Car(), new Bus(), new Bike()};
        for (Vehicle v : vehicles) {
            v.run();
        }
        Vehicle v1 = new DynamicPoly();
        v1.run();

    }

}
