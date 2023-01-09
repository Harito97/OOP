package patterns.iterator.ex_1;

public class IteratorPatternExample {
    public static void main(String[] args) {
        //Tạo mảng String
        String[] product = new String[] {"abc", "defg", "hiklm"};
        ProductCatalog productCatalog = new ProductCatalog(product);
        System.out.println("Ptu 1 cua mang: " +
                productCatalog.getIterator().next());
    }
}
