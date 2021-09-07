package lesson10.task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.Random;

public class FileGen implements Generator {

    private Integer amount;
    private List<Integer> sizes;
    private List<String> extensions;
    private Properties properties;

    public FileGen(Integer amount, List<Object> sizes, List<Object> extensions) {
        this.amount = amount;
        this.sizes = toIntegerList(sizes);
        this.extensions = toStringList(extensions);
        initFieldsFromProperties();
    }

    public FileGen() {
        initFieldsFromProperties();
    }

    public FileGen(List<Object> objects) {
        initListField(objects);
        initFieldsFromProperties();
    }

    public FileGen(Integer amount) {
        this.amount = amount;
        initFieldsFromProperties();
    }

    public FileGen(Integer amount, List<Object> objects) {
        this.amount = amount;
        initListField(objects);
        initFieldsFromProperties();
    }

    public FileGen(List<Integer> sizes, List<String> extensions) {
        this.sizes = sizes;
        this.extensions = extensions;
        initFieldsFromProperties();
    }

    private void initFieldsFromProperties() {
        properties = new Properties();
        String path = "src\\main\\java\\lesson10\\task3\\application.properties";
        try {
            properties.load(new FileReader(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (amount == null) {
            amount = Integer.parseInt(properties.getProperty("filegen.amount", "1"));
        }

        if (sizes == null) {
            List<Integer> sizes = new ArrayList<>();
            int minSize = Integer.parseInt(properties.getProperty("filegen.minsize", "10"));
            int maxSize = Integer.parseInt(properties.getProperty("filegen.maxsize", "100"));
            for (int i = 0; i < amount; i++) {
                int randomSize = new Random().nextInt(maxSize - minSize + 1) + minSize;
                sizes.add(randomSize);
            }
            this.sizes = sizes;
        }

        if (extensions == null) {
            List<String> extensions = new ArrayList<>();
            String[] possibleExtensions = properties.getProperty("filegen.extensions").split(",");
            for (int i = 0; i < amount; i++) {
                String extension = possibleExtensions[new Random().nextInt(possibleExtensions.length)];
                extensions.add(extension);
            }
            this.extensions = extensions;
        }
    }

    public List<File> generate() throws IOException {
        List<File> generatedFiles = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            if (!Files.exists(Paths.get(properties.getProperty("filegen.outputfolder")))) {
                Files.createDirectory(Paths.get(properties.getProperty("filegen.outputfolder")));
            }
            File generatedFile = new File(properties.getProperty("filegen.outputfolder") + "\\generatedFile" + (new Random().nextInt(900000) + 100000) + "." + extensions.get(i));
            try (FileOutputStream writer = new FileOutputStream(generatedFile)) {
                byte[] buffer = new byte[sizes.get(i)];
                new Random().nextBytes(buffer);
                writer.write(buffer);
                writer.flush();
                System.out.printf("%s: %d%n", generatedFile.getName(), generatedFile.length());
                generatedFiles.add(generatedFile);
            }
        }
        return generatedFiles;
    }

    private void initListField(List<Object> objects) {
        Objects.requireNonNull(objects);
        if (objects.isEmpty()) {
            throw new IllegalArgumentException("Передан пустой список");
        }
        if (objects.get(0) instanceof String) {
            this.extensions = toStringList(objects);
        }
        if (objects.get(0) instanceof Integer) {
            this.sizes = toIntegerList(objects);
        }
    }

    private List<String> toStringList(List<Object> objects) {
        List<String> strings = new ArrayList<>();
        for (Object object : objects) {
            strings.add((String) object);
        }
        return strings;
    }

    private List<Integer> toIntegerList(List<Object> objects) {
        List<Integer> integers = new ArrayList<>();
        for (Object object : objects) {
            integers.add((Integer) object);
        }
        return integers;
    }


}