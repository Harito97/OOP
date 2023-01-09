package patterns.visitor.exercises._2;

public interface ComputerPart {
    void accept(ComputerPartVisitor v);
}
