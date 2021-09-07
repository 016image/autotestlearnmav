package lesson10.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileHelper {

    public static Map<String, String> readFile(File file) throws IOException {
        List<String> input = Files.readAllLines(Paths.get(file.getAbsolutePath()));
        Map<String, String> content = new HashMap<>();
        for (String line : input) {
            String key = line.split("=")[0];
            if (line.contains("=") && line.split("=").length == 1) {
                content.put(key, "[]");
                continue;
            }
            String value = parse(line.split("=")[1]);
            content.put(key, value);
        }
        return content;
    }

    private static String parse(String value) {
        String defaultValue = "\"" + value + "\"";
        if (value.equals("null")) return null;
        if (value.equals("")) return "[]";
        if (value.contains(".")) {
            try {
                return String.valueOf(Double.parseDouble(value));
            } catch (NumberFormatException notFloatException) {
                return defaultValue;
            }
        }

        try {
            return String.valueOf(Long.parseLong(value));
        } catch (NumberFormatException ignore) {
        }

        return value.equals("true") || value.equals("false")
                ? value
                : defaultValue;
    }

    public static void saveFile(File file, Map<String, String> content) {
        StringBuilder sb = new StringBuilder("{");
        sb.append(System.lineSeparator());
        for (Map.Entry<String, String> entry : content.entrySet()) {
            sb.append(String.format("  \"%s\": %s,%n", entry.getKey(), entry.getValue()));
        }
        int lastComma = sb.lastIndexOf(",");
        sb.replace(lastComma, lastComma + 1, "");
        sb.append("}");
        String output = sb.toString();
        System.out.println(output);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(output);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}