package com.absjrdev.benefitsapi.enterprise.repository;

import com.absjrdev.benefitsapi.enterprise.domain.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {
}
