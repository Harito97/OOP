package patterns.decorator.ex_1;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    public void draw(){
        setRedBorder();
        System.out.print("\nDa ve xong hinh");
        shape.draw();
    }

    private void setRedBorder(){
        System.out.println("Da chuyen bord cua shape thanh mau do");
    }
}
