package json.jackson.action;

import json.jackson.entity.PeopleEntity;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonParse {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        TypeFactory typeFactory = mapper.getTypeFactory();
        List<PeopleEntity> value = new ArrayList<>();
        try {
            File file = new File("src/main/resources/json/jackson/data.json");
            System.out.println(file.getAbsolutePath());
            value = mapper.readValue(file, typeFactory.constructCollectionType(List.class, PeopleEntity.class));
        } catch (IOException e) {
            e.printStackTrace();
        }


        File file = new File("src/main/resources/json/jackson/data1.json");
        try {
            mapper.writeValue(file, value);
            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
