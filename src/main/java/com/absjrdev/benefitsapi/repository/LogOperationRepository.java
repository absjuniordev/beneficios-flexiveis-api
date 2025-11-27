package com.absjrdev.benefitsapi.repository;

import com.absjrdev.benefitsapi.domain.entity.LogOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogOperationRepository extends JpaRepository<LogOperation, Long> {
}
