package autotestlearn.lesson12.task1;

import lesson12.task1.helpers.JsonHelper;
import lesson12.task1.model.Flat;
import lesson12.task1.model.House;
import lesson12.task1.model.Room;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonDeserializerTest {
    private final JsonHelper helper = new JsonHelper();
    private final String ROOM_PATH = "src\\main\\java\\lesson12\\task1\\files\\room.json";
    private final String FLAT_PATH = "src\\main\\java\\lesson12\\task1\\files\\flat.json";
    private final String HOUSE_PATH = "src\\main\\java\\lesson12\\task1\\files\\house.json";

    @Test
    @DisplayName("Проверка десериализации объекта Room")
    void deserializationRoomTest() throws IOException {
        String json = String.join("", Files.readAllLines(Paths.get(ROOM_PATH)));
        Room room = (Room) helper.deserialize(json, Room.class);

        Assertions.assertEquals(6, room.getWidth());
        Assertions.assertEquals(5, room.getHeight());
    }

    @Test
    @DisplayName("Проверка десериализации объекта Flat")
    void deserializationFlatTest() throws IOException {
        String json = String.join("", Files.readAllLines(Paths.get(FLAT_PATH)));
        Flat flat = (Flat) helper.deserialize(json, Flat.class);

        Assertions.assertEquals(3, flat.getRooms().size());

        Assertions.assertEquals(4, flat.getRooms().get(0).getWidth());
        Assertions.assertEquals(3, flat.getRooms().get(0).getHeight());

        Assertions.assertEquals(6, flat.getRooms().get(1).getWidth());
        Assertions.assertEquals(5, flat.getRooms().get(1).getHeight());

        Assertions.assertEquals(2, flat.getRooms().get(2).getWidth());
        Assertions.assertEquals(3, flat.getRooms().get(2).getHeight());
    }

    @Test
    @DisplayName("Проверка десериализации объекта House")
    void deserializationHouseTest() throws IOException {
        String json = String.join("", Files.readAllLines(Paths.get(HOUSE_PATH)));
        House house = (House) helper.deserialize(json, House.class);

        // House:
        Assertions.assertEquals(3, house.getFlats().size());
        Assertions.assertEquals(2, house.getFlats().get(0).getRooms().size());
        Assertions.assertEquals(1, house.getFlats().get(1).getRooms().size());
        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().size());

        // Flat 1:
        Assertions.assertEquals(2, house.getFlats().get(0).getRooms().size());
        Assertions.assertEquals(3, house.getFlats().get(0).getRooms().get(0).getWidth());
        Assertions.assertEquals(4, house.getFlats().get(0).getRooms().get(0).getHeight());
        Assertions.assertEquals(4, house.getFlats().get(0).getRooms().get(1).getWidth());
        Assertions.assertEquals(3, house.getFlats().get(0).getRooms().get(1).getHeight());

        // Flat 2:
        Assertions.assertEquals(1, house.getFlats().get(1).getRooms().size());
        Assertions.assertEquals(5, house.getFlats().get(1).getRooms().get(0).getWidth());
        Assertions.assertEquals(6, house.getFlats().get(1).getRooms().get(0).getHeight());

        // Flat 3:
        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().size());
        Assertions.assertEquals(2, house.getFlats().get(2).getRooms().get(0).getWidth());
        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().get(0).getHeight());
        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().get(1).getWidth());
        Assertions.assertEquals(4, house.getFlats().get(2).getRooms().get(1).getHeight());
        Assertions.assertEquals(4, house.getFlats().get(2).getRooms().get(2).getWidth());
        Assertions.assertEquals(8, house.getFlats().get(2).getRooms().get(2).getHeight());
    }
}