package com.absjrdev.benefitsapi.employee.repository;

import com.absjrdev.benefitsapi.employee.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
