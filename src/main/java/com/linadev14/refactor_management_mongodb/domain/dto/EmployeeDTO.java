package com.linadev14.refactor_management_mongodb.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private String id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
