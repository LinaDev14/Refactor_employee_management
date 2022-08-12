package com.linadev14.refactor_management_mongodb.infraestructure.queries;

import com.linadev14.refactor_management_mongodb.application.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/query/employee")
@RequiredArgsConstructor
public class EmployeeQueryController {


    private final EmployeeService employeeService;

}
