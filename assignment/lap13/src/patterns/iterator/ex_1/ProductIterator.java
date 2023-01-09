package patterns.iterator.ex_1;

public class ProductIterator implements Iterator{
    private String[] items;
    private int position = 0;
    public ProductIterator(String[] items){
        this.items = items;
    }

    public boolean hasNext(){
        if (position >= items.length || items[position] == null){
            return false;
        }
        return true;
    }

    public Object next(){
        String item = items[position];
        position++;
        return item;
    }
}
