package oopprinciples.inheritance;

// inherit from Animal
public class Dog extends Animal {

    // new method in subclass
    public void display() {
        System.out.println("My name is " + name);
    }
}
