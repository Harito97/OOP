package patterns.decorator.ex_2;

public abstract class ToppingDecorator {
    IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription(){
        return iceCream.getDescription();
                //+ " " + this.addTopping();
    }

    public String addTopping(){
        return "đã được thêm";
    }
}
