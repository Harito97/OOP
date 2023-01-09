package patterns.decorator.pseudocode;

public class CompressionDecorator extends DataSourceDecorator{
    //Nén dữ liệu compress
    public CompressionDecorator(DataSource wrappee){
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        //Compress data (mã hóa)
        String compressData = "ahihi data nay da nen roi nhe";

        //Cho du lieu da ma hoa vao encrypted
        wrappee.writeData(compressData);
    }

    @Override
    public String readData(){
        //Get data from the wrappee
        String data = wrappee.readData();
        //Decompress data if it's been encrypted
        if (true){
            data = "data nay da duoc giai nen sau khi da duoc ma hoa roi nhe";
        }
        //return result
        return data;
    }
}
