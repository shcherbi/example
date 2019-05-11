package json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import json.entity.PeopleEntity;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class GsonParse {
    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        List<PeopleEntity> value = new ArrayList<>();
        try {
            File file = new File("src/main/resources/json/jackson/data.json");
            String json = new String(Files.readAllBytes(file.toPath()));
            System.out.println(file.getAbsolutePath());
            Type listType = TypeToken.getParameterized(List.class,PeopleEntity.class).getType();
            value = gson.fromJson(json, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("src/main/resources/json/jackson/data1.json");
        gson.toJson(value);
        file.delete();
    }
}
