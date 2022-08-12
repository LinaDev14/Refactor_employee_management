package com.linadev14.refactor_management_mongodb.domain.repository;

import com.linadev14.refactor_management_mongodb.domain.document.Employee;
import com.linadev14.refactor_management_mongodb.domain.dto.EmployeeDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

    // find employees by firstname
    List<EmployeeDTO> findAllByFirstNameContainingIgnoreCaseOrderByFirstName(String firstName);

    // find employees by last name
    List<EmployeeDTO> findAllByLastNameContainingIgnoreCaseOrderByLastName(String lastName);
}
