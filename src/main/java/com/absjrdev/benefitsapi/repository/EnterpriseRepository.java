package com.absjrdev.benefitsapi.repository;

import com.absjrdev.benefitsapi.domain.entity.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {
}
