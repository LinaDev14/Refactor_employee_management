package com.linadev14.refactor_management_mongodb.application.service;
import com.linadev14.refactor_management_mongodb.application.mapper.EmployeeMapper;
import com.linadev14.refactor_management_mongodb.domain.dto.EmployeeDTO;
import com.linadev14.refactor_management_mongodb.domain.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService implements EmployeeServiceInterface{

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;


    @Override
    public List<EmployeeDTO> fillData(List<EmployeeDTO> employeeDTO) {

        return employeeRepository.saveAll(employeeDTO.stream()
                .map(employeeMapper.mapToCollectionEmployee())
                .collect(Collectors.toList()))
                .stream()
                .map(employeeMapper.mapToDTOEmployee())
                .collect(Collectors.toList());
    }

    @Override
    public List<EmployeeDTO> listEmployee() {

        return employeeRepository.findAll()
                .stream()
                .map(employeeMapper.mapToDTOEmployee())
                .collect(Collectors.toList());
    }

    @Override
    public Optional<EmployeeDTO> findById(String id) {

        return employeeRepository.findById(id)
                .map(employeeMapper.mapToDTOEmployee());
    }

    @Override
    public List<EmployeeDTO> findAllByFirstNameContainingIgnoreCaseOrderByFirstName(String firstName) {

        return employeeRepository.
    }

    @Override
    public List<EmployeeDTO> findAllByLastNameContainingIgnoreCaseOrderByLastName(String lastName) {

        return null;
    }

    @Override
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {

        return null;
    }

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {

        return null;
    }

    @Override
    public void deleteEmployee(String id) {

    }

    @Override
    public void deleteAllEmployees() {

    }

}
