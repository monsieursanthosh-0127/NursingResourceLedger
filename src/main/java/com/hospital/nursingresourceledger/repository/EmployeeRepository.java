package com.hospital.nursingresourceledger.repository;

import com.hospital.nursingresourceledger.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository <Employee,Long> {

    public void deleteEmployeeById(Long id);
    public Optional<Employee> findEmployeeById(Long id);
}
