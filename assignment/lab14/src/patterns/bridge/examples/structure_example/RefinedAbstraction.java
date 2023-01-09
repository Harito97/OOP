package patterns.bridge.examples.structure_example;

public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementation implementation) {
        super(implementation);
    }

    public void operation(){
        this.implementation.operation();
    }
}
