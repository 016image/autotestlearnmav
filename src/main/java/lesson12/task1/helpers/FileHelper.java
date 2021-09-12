package lesson12.task1.helpers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileHelper {

    public String getFileContext(String path) {
        List<String> context = null;
        try {
            context = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert context != null;
        return String.join(System.lineSeparator(), context);
    }
}