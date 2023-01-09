package patterns.visitor.exercises._1;

public class BusinessBook implements Book {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return "Call Me Fox";
    }
}
