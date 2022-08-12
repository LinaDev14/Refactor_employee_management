package com.linadev14.refactor_management_mongodb.application.service;
import com.linadev14.refactor_management_mongodb.domain.document.Employee;
import com.linadev14.refactor_management_mongodb.domain.dto.EmployeeDTO;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {

    // save all data
    List<EmployeeDTO> fillData(List<EmployeeDTO> employeeDTO);

    //get employees
    List<EmployeeDTO> listEmployee();

    // get employees by id
    Optional<EmployeeDTO> findById(String id);

    // find employees by firstname
    List<EmployeeDTO> findByFirstName(String firstName);

    // find employees by lastname
    List<EmployeeDTO> findByLastName(String lastName);

    // update employee
    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);
    // save a new employee
    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);

    // delete employee by id
    void deleteEmployee(String id);

    // delete all employees
    void deleteAllEmployees();
}
