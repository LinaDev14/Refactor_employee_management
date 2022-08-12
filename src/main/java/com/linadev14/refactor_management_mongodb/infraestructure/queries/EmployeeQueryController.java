package com.linadev14.refactor_management_mongodb.infraestructure.queries;

import com.linadev14.refactor_management_mongodb.application.service.EmployeeService;
import com.linadev14.refactor_management_mongodb.domain.dto.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/query/employee")
@RequiredArgsConstructor
public class EmployeeQueryController {

    /*
     * GET -> consult
     * POST -> create
     * PUT -> Edit
     * DELETE -> delete
     * */


    private final EmployeeService employeeService;

    // list employee
    // localhost:8080/api/query/employee/listEmployee
    @GetMapping("/listEmployee")
    public ResponseEntity<List<EmployeeDTO>> listUser(){
        return new ResponseEntity<>(employeeService.listEmployee(), HttpStatus.OK);
    }

}
