package oops.Inheritance;
class Animal {

    void eat() {
        System.out.println("Eating...");
    }
}

interface Flyable {

    void fly();
}

class Bird extends Animal {

    void chirp() {
        System.out.println("Chirping...");
    }
}

class Sparrow extends Bird implements Flyable {

    public void fly() {
        System.out.println("Sparrow flying...");
    }
}

public class Hybrid {

    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.eat();
        s.chirp();
        s.fly();
    }
}
