package patterns.bridge.examples.structure_example;

public class Client {
    public static void main(String[] args) {
        Implementation implementation = new ConcreteImplementation();
        Abstraction abstraction = new RefinedAbstraction(implementation);
        abstraction.operation();
    }
}
