package patterns.visitor.exercises._1;

public class DesignPatternBook implements ProgrammingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "Head First Design Patterns";
    }

    public String getBestSeller() {
        return "HUS";
    }
}
