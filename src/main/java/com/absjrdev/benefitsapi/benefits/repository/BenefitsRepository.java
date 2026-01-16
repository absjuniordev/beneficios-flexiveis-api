package com.absjrdev.benefitsapi.benefits.repository;

import com.absjrdev.benefitsapi.benefits.domain.Benefits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BenefitsRepository extends JpaRepository<Benefits, Long> {

    boolean existsByName(String name);
    Optional<Benefits> findByName(String name);
}
