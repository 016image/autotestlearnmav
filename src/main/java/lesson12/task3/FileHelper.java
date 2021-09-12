package lesson12.task3;

import com.google.gson.Gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileHelper<T> {

    public T getObjectFromJsonInFile(String path, Class<T> clazz) throws IOException {
        List<String> content = Files.readAllLines(Paths.get(path));
        String json = String.join("", content);
        return new Gson().fromJson(json, clazz);
    }
}
