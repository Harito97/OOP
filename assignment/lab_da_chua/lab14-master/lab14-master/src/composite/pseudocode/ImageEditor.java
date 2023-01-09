package composite.pseudocode;

public class ImageEditor {
    private CompoundGraphic all;

    public void load() {
        all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
    }

    public void groupSelected(Graphic[] components) {
        CompoundGraphic group = new CompoundGraphic();
        for (Graphic component : components) {
            group.add(component);
            all.remove(component);
        }
        all.add(group);
        all.draw();
    }

    public static void main(String[] args) {
        ImageEditor imageEditor = new ImageEditor();
        imageEditor.load();
        CompoundGraphic compoundGraphic = new CompoundGraphic();
        compoundGraphic.add(new Circle(1, 1, 1));
        compoundGraphic.add(new Dot(2, 2));
        compoundGraphic.add(new Circle(1, 1, 2));
        Graphic[] components = new Graphic[]{new Dot(1, 1), new Circle(1, 2, 3), compoundGraphic};
        imageEditor.groupSelected(components);
        System.out.println("===============================");
        imageEditor.all.move(2, 4);
        imageEditor.all.draw();
    }
}
