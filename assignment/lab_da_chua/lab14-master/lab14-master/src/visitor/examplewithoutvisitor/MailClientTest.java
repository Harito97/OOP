package visitor.examplewithoutvisitor;

public class MailClientTest {
    public void testConfigureMailClientForDifferenceEnvironments() throws Exception {
        MailClient operaMailClient = new OperaMailClient();
        operaMailClient.configureForMac();
        operaMailClient.configureForWindows();

        MailClient squirrelMailClient = new SquirrelMailClient();
        squirrelMailClient.configureForMac();
        squirrelMailClient.configureForWindows();
    }

    public static void main(String[] args) throws Exception {
        MailClientTest mailClientTest = new MailClientTest();
        mailClientTest.testConfigureMailClientForDifferenceEnvironments();
    }
}
