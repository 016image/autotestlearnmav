package lesson10.task3;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface Generator {

    List<File> generate() throws IOException;

}