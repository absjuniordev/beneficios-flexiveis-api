package com.absjrdev.benefitsapi.repository;

import com.absjrdev.benefitsapi.domain.benefits.Benefits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BenefitsRepository extends JpaRepository<Benefits, Long> {

    boolean existsByName(String name);
    Optional<Benefits> findByName(String name);
}
