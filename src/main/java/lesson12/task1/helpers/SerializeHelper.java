package lesson12.task1.helpers;


import com.fasterxml.jackson.core.JsonProcessingException;
import lesson12.task1.model.Generatable;

public interface SerializeHelper<T extends Generatable> {

    T deserialize(String data, Class<T> clazz) throws JsonProcessingException;

    String serialize(T object) throws JsonProcessingException;
}