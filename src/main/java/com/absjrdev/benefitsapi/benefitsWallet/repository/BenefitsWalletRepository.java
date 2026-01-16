package com.absjrdev.benefitsapi.benefitsWallet.repository;

import com.absjrdev.benefitsapi.benefitsWallet.domain.BenefitsWallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitsWalletRepository extends JpaRepository<BenefitsWallet, Long> {
}
