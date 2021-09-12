package autotestlearn.lesson12.task3;

import com.google.gson.Gson;
import org.apache.poi.ss.formula.functions.T;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonDeserializationTest {

    protected final String PERSON_JSON = "src/main/java/lesson12/task3/person.json";
    protected final String PROJECT_JSON = "src/main/java/lesson12/task3/project.json";

    public T getObjectFromJsonInFile(String path, Class<T> clazz) throws IOException {
        List<String> content = Files.readAllLines(Paths.get(path));
        String json = String.join("", content);
        return new Gson().fromJson(json, clazz);
    }
}
