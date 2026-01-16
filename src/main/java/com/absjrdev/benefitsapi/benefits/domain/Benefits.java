package com.absjrdev.benefitsapi.benefits.domain;

import com.absjrdev.benefitsapi.benefitsWallet.domain.BenefitsWallet;
import jakarta.persistence.*;
import lombok.Getter;
import java.util.List;


@Getter
@Entity
@Table(name = "tb_benefits")
public class Benefits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String description;

    private Double limitMonthly;

    @OneToMany(mappedBy = "benefits")
    private List<BenefitsWallet> wallets;

    protected Benefits() {
    }

    private Benefits(String name, String description, Double limitMonthly) {
        this.nome = name;
        this.description = description;
        this.limitMonthly = limitMonthly;
    }

    public static Benefits create(String name, String description, Double limitMonthly) {
        return new Benefits(name, description, limitMonthly);
    }

}
