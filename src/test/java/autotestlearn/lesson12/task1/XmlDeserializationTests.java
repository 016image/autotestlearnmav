package autotestlearn.lesson12.task1;

import com.fasterxml.jackson.core.JsonProcessingException;
import lesson12.task1.helpers.FileHelper;
import lesson12.task1.helpers.XmlHelper;
import lesson12.task1.model.Flat;
import lesson12.task1.model.House;
import lesson12.task1.model.Room;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class XmlDeserializationTests {
    String roomXmlPath = "src\\main\\java\\lesson12\\task1\\files\\room.xml";
    String flatXmlPath = "src\\main\\java\\lesson12\\task1\\files\\flat.xml";
    String houseXmlPath = "src\\main\\java\\lesson12\\task1\\files\\house.xml";
    XmlHelper xmlHelper = new XmlHelper();
    FileHelper fileHelper = new FileHelper();

    @Test
    @DisplayName("Десериализация room из xml")
    public void roomDeserializationTest() {
        try {
            String roomXmlContext = fileHelper.getFileContext(roomXmlPath);
            Room actualRoom = (Room) xmlHelper.deserialize(roomXmlContext, Room.class);
            Assertions.assertEquals(6, actualRoom.getWidth());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    @Test
    @DisplayName("Десериализация flat из xml")
    public void flatDeserializationTest() {
        try {
            String flatXmlContext = fileHelper.getFileContext(flatXmlPath);
            Flat actualFlat = (Flat) xmlHelper.deserialize(flatXmlContext, Flat.class);
            Assertions.assertEquals(3, actualFlat.getRooms().size());
            Assertions.assertEquals(6, actualFlat.getRooms().get(1).getWidth());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Десериализация house из xml")
    public void houseDeserializationTest() {
        try {
            String houseXmlContext = fileHelper.getFileContext(houseXmlPath);
            House expectedHouse = (House) xmlHelper.deserialize(houseXmlContext, House.class);
            Assertions.assertEquals(3, expectedHouse.getFlats().size());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}

