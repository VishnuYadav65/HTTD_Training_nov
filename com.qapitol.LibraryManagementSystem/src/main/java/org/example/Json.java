package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Json {


    static File file;
    static ObjectMapper mapper;


    public static void writeData(List<Student> studentDetails) throws IOException {
        file= new File("C:\\Users\\Qapitol QA\\IdeaProjects\\com.qapitol.LibraryManagementSystem\\src\\main\\java\\org\\example\\Data1.json");



    if (!file.exists()) {
        file.createNewFile();
    }

    mapper  = new ObjectMapper();
    mapper.writeValue(file, studentDetails);


}

public static List<Student> readData() throws IOException {
    List<Student> data = mapper.readValue(file, new TypeReference<List<Student>>() {
    });
return data;
}

}
