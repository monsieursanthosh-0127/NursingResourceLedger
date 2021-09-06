package com.hospital.nursingresourceledger.service;

import com.hospital.nursingresourceledger.exception.UserNotFoundException;
import com.hospital.nursingresourceledger.model.Employee;
import com.hospital.nursingresourceledger.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee  employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteEmployeeById(id);
    }

    public Employee findEmployeeById(Long id){
       return employeeRepository.findEmployeeById(id).orElseThrow(()-> new UserNotFoundException("No User for the given id:"+id+" exists."));
    }
}
