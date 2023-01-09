package patterns.decorator.ex_2;

public class HoneyToppingDecorator extends ToppingDecorator{

    public HoneyToppingDecorator(IceCream iceCream){
        super(iceCream);
    }

    public String getDescription(){
        return super.getDescription()
                + " " + addTopping()
                + " " + "nên rất ngọt";
    }

    public String addTopping(){
        return "suger";
    }
}
