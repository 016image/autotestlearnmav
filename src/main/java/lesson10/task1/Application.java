package lesson10.task1;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws IOException {

        File inputFile = new File("src/main/java/lesson10/task1/input.txt");
        File outputFile = new File("src/main/java/lesson10/task1/output.txt");

        Map<String, String> content = FileHelper.readFile(inputFile);
        FileHelper.saveFile(outputFile, content);
    }
}