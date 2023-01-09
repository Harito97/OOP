package composite.pseudocode;

public class Circle extends Dot {
    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("[(" + x + ", " + y + "), radius=" + radius + "]");
    }
}
