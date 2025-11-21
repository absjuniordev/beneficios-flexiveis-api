package com.absjrdev.benefitsapi.domain.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="tb_benefits")
public class Benefits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String description;

    private Double limitMonthly;

    @OneToMany(mappedBy = "benefits")
    private List<BenefitsWallet> wallets;

}
