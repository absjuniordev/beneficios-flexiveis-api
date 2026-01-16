package com.absjrdev.benefitsapi.logOperation.repository;

import com.absjrdev.benefitsapi.logOperation.domain.LogOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogOperationRepository extends JpaRepository<LogOperation, Long> {
}
