package com.linadev14.refactor_management_mongodb.application.utils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.linadev14.refactor_management_mongodb.domain.dto.EmployeeDTO;
import lombok.Getter;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Getter
public class JsonReader {

    private final String path = "src/main/java/com/linadev14/refactor_management_mongodb/domain/utils/Data.json";
    private final ObjectMapper objectMapper = new ObjectMapper();
    private List<EmployeeDTO> employeeDTO;

    public JsonReader(){
        try{
            employeeDTO = objectMapper.readValue(new File(path), new TypeReference<>() {});
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
