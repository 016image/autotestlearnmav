package lesson12.task1.helpers;

import com.google.gson.Gson;
import lesson12.task1.model.Generatable;

public class JsonHelper implements SerializeHelper {
    @Override
    public Generatable deserialize(String json, Class aClass) {
        return (Generatable) new Gson().fromJson(json, aClass);
    }

    @Override
    public String serialize(Generatable object) {
        return new Gson().toJson(object);
    }
}