package obsever_pattern.pseudocode;

import java.io.File;
import java.io.FileWriter;

public class LoggingListener implements EventListener{
    private File log;

    public LoggingListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
