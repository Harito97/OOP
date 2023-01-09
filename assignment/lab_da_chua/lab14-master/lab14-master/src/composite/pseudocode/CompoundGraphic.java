package composite.pseudocode;

import java.util.Arrays;

public class CompoundGraphic implements Graphic {
    private Graphic[] children = new Graphic[6];
    private int count = 0;

    public void add(Graphic child) {
        if (count == children.length) {
            children = Arrays.copyOf(children, children.length * 2);
        }
        children[count++] = child;
    }

    public void remove(Graphic child) {
        for (int i = 0; i < children.length - 1; i++) {
            if (child.equals(children[i])) {
                for (int j = i; j < children.length - 1; j++) {
                    children[j] = children[j + 1];
                }
                count--;
            }
        }
    }

    @Override
    public void move(int x, int y) {
        for (Graphic child : children) {
            if (child != null) {
                child.move(x, y);
            }
        }
    }

    private int getX1() {
        if (count == 0) {
            return 0;
        }
        int x = ((Dot) children[0]).x;
        for (Graphic child : children) {
            if (child instanceof CompoundGraphic compoundGraphic) {
                int x1 = compoundGraphic.getX1();
                if (x > x1) {
                    x = x1;
                }
            } else if (child instanceof Circle circle) {
                if (x > circle.x - circle.radius) {
                    x = circle.x - circle.radius;
                }
            } else if (child instanceof Dot dot) {
                if (x > dot.x) {
                    x = dot.x;
                }
            }
        }
        return x;
    }

    private int getX2() {
        if (count == 0) {
            return 0;
        }
        int x = ((Dot) children[0]).x;
        for (Graphic child : children) {
            if (child instanceof CompoundGraphic compoundGraphic) {
                int x2 = compoundGraphic.getX2();
                if (x < x2) {
                    x = x2;
                }
            } else if (child instanceof Circle circle) {
                if (x < circle.x + circle.radius) {
                    x = circle.x + circle.radius;
                }
            } else if (child instanceof Dot dot) {
                if (x < dot.x) {
                    x = dot.x;
                }
            }
        }
        return x;
    }

    private int getY1() {
        if (count == 0) {
            return 0;
        }
        int y = ((Dot) children[0]).y;
        for (Graphic child : children) {
            if (child instanceof CompoundGraphic compoundGraphic) {
                int y1 = compoundGraphic.getY1();
                if (y < y1) {
                    y = y1;
                }
            } else if (child instanceof Circle circle) {
                if (y < circle.y + circle.radius) {
                    y = circle.y + circle.radius;
                }
            } else if (child instanceof Dot dot) {
                if (y < dot.y) {
                    y = dot.y;
                }
            }
        }
        return y;
    }

    private int getY2() {
        if (count == 0) {
            return 0;
        }
        int y = ((Dot) children[0]).y;
        for (Graphic child : children) {
            if (child instanceof CompoundGraphic compoundGraphic) {
                int y2 = compoundGraphic.getY2();
                if (y > y2) {
                    y = y2;
                }
            } else if (child instanceof Circle circle) {
                if (y > circle.y - circle.radius) {
                    y = circle.y - circle.radius;
                }
            } else if (child instanceof Dot dot) {
                if (y > dot.y) {
                    y = dot.y;
                }
            }
        }
        return y;
    }

    @Override
    public void draw() {
        for (Graphic child : children) {
            if (child != null) {
                child.draw();
            }
        }
        System.out.println("Bounding Rectangle: (" + getX1() + ", " + getY1() + "), (" + getX2() + ", " + getY2() + ")");
    }
}
