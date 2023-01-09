package patterns.bridge.examples.structure_example;

public class Abstraction {
    protected Implementation implementation;

    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    public void operation(){
        this.implementation.operation();
    }
}
