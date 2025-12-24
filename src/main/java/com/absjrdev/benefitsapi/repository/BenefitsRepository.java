package com.absjrdev.benefitsapi.repository;

import com.absjrdev.benefitsapi.domain.benefits.Benefits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitsRepository extends JpaRepository<Benefits, Long> {
}
