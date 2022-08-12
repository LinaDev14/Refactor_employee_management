package com.linadev14.refactor_management_mongodb.infraestructure.commads;

import com.linadev14.refactor_management_mongodb.application.service.EmployeeService;
import com.linadev14.refactor_management_mongodb.domain.dto.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/command/employee")
@RequiredArgsConstructor
public class EmployeeCommandController {

    /*
     * GET -> consult
     * POST -> create
     * PUT -> Edit
     * DELETE -> delete
     * */

    private final EmployeeService employeeService;

    // fill Data
    // localhost:8080/api/command/employee/fillData
    @PostMapping("/fillData")
    public ResponseEntity<List<EmployeeDTO>> saveAll(@RequestBody List<EmployeeDTO> employeeDTO){
        return new ResponseEntity<>(employeeService.fillData(employeeDTO), HttpStatus.CREATED);
    }


}
