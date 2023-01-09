package patterns.visitor.exercises._2;


public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart[] computerParts = new ComputerPart[]{new Monitor(), new Monitor(), new Mouse(), new Keyboard()};
        ComputerPart computer = new Computer(computerParts);
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
