package com.example.Employee_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Employee_Management.entity.Employee;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);


}
