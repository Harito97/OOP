package patterns.decorator.pseudocode;

public class EncryptionDecorator extends DataSourceDecorator{
    public EncryptionDecorator(DataSource wrappee){
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        //Encrypt data (mã hóa)
        String encryptData = "ahihi data nay da ma hoa roi nhe";

        //Cho du lieu da ma hoa vao encrypted
        wrappee.writeData(encryptData);
    }

    @Override
    public String readData(){
        //Get data from the wrappee
        String data = wrappee.readData();
        //Decrypt data if it's been encrypted
        if (true){
            data = "data nay da duoc giai ma sau khi da duoc ma hoa roi nhe";
        }
        //return result
        return data;
    }
}
