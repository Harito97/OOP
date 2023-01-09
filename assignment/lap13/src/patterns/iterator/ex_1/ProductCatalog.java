package patterns.iterator.ex_1;

public class ProductCatalog {
    private Iterator iterator;
    private String[] productCatalog;

    public ProductCatalog(String[] product){
        this.productCatalog = product;
        iterator = new ProductIterator(product);
    }
    public Iterator getIterator(){
        return iterator;
    }
}
