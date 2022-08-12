package com.linadev14.refactor_management_mongodb.domain.document;

import com.linadev14.refactor_management_mongodb.domain.valueObject.Country;
import com.linadev14.refactor_management_mongodb.domain.valueObject.Gender;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "employee")
public class Employee {

    @Id
    private final String id;

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phoneNumber;
    private final Country country;
    private final Gender gender;
}
