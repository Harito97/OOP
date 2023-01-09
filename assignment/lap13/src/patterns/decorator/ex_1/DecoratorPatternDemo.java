package patterns.decorator.ex_1;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape shapeDecorator = (Shape) new RedShapeDecorator(circle);

        shapeDecorator.draw();
    }
}
