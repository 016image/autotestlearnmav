package lesson10.task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHelper {

    public static void write(List<String> content) {
        try (FileWriter writer = new FileWriter(Config.OUTPUT_FILE)) {
            for (String line : content)
                writer.write(line + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}