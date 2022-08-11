package com.linadev14.refactor_management_mongodb.domain.repository;

import com.linadev14.refactor_management_mongodb.domain.document.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
