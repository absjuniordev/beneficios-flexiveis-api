package com.absjrdev.benefitsapi.repository;

import com.absjrdev.benefitsapi.domain.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
