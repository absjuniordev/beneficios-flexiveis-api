package com.absjrdev.benefitsapi.repository;

import com.absjrdev.benefitsapi.domain.entity.BenefitsWallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitsWalletRepository extends JpaRepository<BenefitsWallet, Long> {
}
