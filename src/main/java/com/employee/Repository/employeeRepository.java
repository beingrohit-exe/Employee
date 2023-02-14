package com.employee.Repository;

import com.employee.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<Employee, String> {
    boolean existsByEmailIgnoreCase(String email);
    boolean existsByEmployeeId(String employeeId);
}
