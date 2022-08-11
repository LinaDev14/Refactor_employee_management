package com.linadev14.refactor_management_mongodb.application.mapper;

import com.linadev14.refactor_management_mongodb.domain.document.Employee;
import com.linadev14.refactor_management_mongodb.domain.dto.EmployeeDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class EmployeeMapper {

    // FROM EMPLOYEE TO EMPLOYEE_DTO
    public Function<Employee, EmployeeDTO> mapToEmployeeDTO(){

        return employee -> new EmployeeDTO(
          employee.getId(),
          employee.getFirstName(),
          employee.getLastName(),
          employee.getEmail(),
          employee.getPhoneNumber(),
          employee.getCountry(),
          employee.getGender()
        );
    }
}
