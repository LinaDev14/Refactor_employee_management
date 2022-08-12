package com.linadev14.refactor_management_mongodb.application.mapper;

import com.linadev14.refactor_management_mongodb.domain.document.Employee;
import com.linadev14.refactor_management_mongodb.domain.dto.EmployeeDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class EmployeeMapper {

    // FROM EMPLOYEE TO EMPLOYEE_DTO
    public Function<Employee, EmployeeDTO> mapToDTOEmployee(){

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

    // FROM EMPLOYEE_DTO TO EMPLOYEE
    public Function<EmployeeDTO, Employee> mapToCollectionEmployee(){

        return employeeDTO -> new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName(),
                employeeDTO.getEmail(),
                employeeDTO.getPhoneNumber(),
                employeeDTO.getCountry(),
                employeeDTO.getGender()
        );
    }
}
