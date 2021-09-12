package lesson12.task2;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Helper {

    public static String getJsonArrayFromXls(String path, String sheetName) throws IOException {
        InputStream stream = new FileInputStream(new File(path));
        Workbook workbook = new XSSFWorkbook(stream);
        Sheet sheet = workbook.getSheet(sheetName);
        final List<Map<String, String>> data = getDataFromSheet(sheet);

        JsonArray array = new JsonArray();
        for (Map<String, String> value : data) {
            JsonObject object = new JsonObject();
            for (Map.Entry<String, String> entry : value.entrySet())
                object.addProperty(entry.getKey(), entry.getValue());
            array.add(object);
        }
        return array.toString();
    }

    public static String getXmlFromXls(String path, String sheetName) throws IOException {
        InputStream stream = new FileInputStream(new File(path));
        Workbook workbook = new XSSFWorkbook(stream);
        Sheet sheet = workbook.getSheet(sheetName);
        final List<Map<String, String>> data = getDataFromSheet(sheet);

        XmlMapper mapper = new XmlMapper();
        return mapper.writeValueAsString(data);
    }

    private static List<Map<String, String>> getDataFromSheet(Sheet sheet) {
        int index = 0;
        final List<String> keys = new ArrayList<>();
        final List<Map<String, String>> data = new ArrayList<>();

        Row firstRow = sheet.getRow(0);
        for (Cell firstRowCell : firstRow)
            keys.add(firstRowCell.getStringCellValue());

        for (Row row : sheet) {
            if (index++ != 0) {
                int keyIndex = 0;
                Map<String, String> currentObject = new TreeMap<>();
                for (Cell cell : row) {
                    String key = keys.get(keyIndex++);
                    String value = cell.getStringCellValue();
                    currentObject.put(key, value);
                }
                data.add(currentObject);
            }
        }
        return data;
    }
}