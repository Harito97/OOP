package patterns.decorator.pseudocode;

public class DataSourceDecorator implements DataSource{
    protected DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    public void writeData(String data){
        wrappee.writeData(data);
    }

    public String readData(){
        return wrappee.readData();
    }
}
