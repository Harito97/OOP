package patterns.decorator.ex_2;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream3 = new ChocolateIceCream();
        IceCream iceCream2 = new StrawberryIceCream();
        IceCream iceCream1 = new VanillaIceCream();

        ToppingDecorator toppingDecorator1 = new HoneyToppingDecorator(iceCream1);
        ToppingDecorator toppingDecorator2 = new NutsToppingDecorator(iceCream2);

        System.out.println(toppingDecorator1.getDescription());
        System.out.println(toppingDecorator2.getDescription());
    }
}
