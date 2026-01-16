package com.absjrdev.benefitsapi.enterprise.domain;


import com.absjrdev.benefitsapi.employee.domain.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_enterprises")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String cnpj;

    @OneToMany(mappedBy = "enterprise")
    private List<Employee> employees;
}
