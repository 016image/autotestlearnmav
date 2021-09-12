package lesson12.task1.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lesson12.task1.model.Generatable;

public class XmlHelper implements SerializeHelper {

    @Override
    public Generatable deserialize(String data, Class clazz) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        return (Generatable) xmlMapper.readValue(data, clazz);
    }

    @Override
    public String serialize(Generatable object) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.writeValueAsString(object);
    }
}