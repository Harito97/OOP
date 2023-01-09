package patterns.decorator.ex_2;

public class NutsToppingDecorator extends ToppingDecorator{
    public NutsToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    public String getDescription(){
        return super.getDescription()
                + " " + addTopping()
                + " " + "nên rất giòn tan";
    }

    public String addTopping() {
        return "nuts";
    }
}
