package com.absjrdev.benefitsapi.domain.employee;

import com.absjrdev.benefitsapi.domain.enterprise.Enterprise;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="tb_employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dateBirth;
    private String phone;
    private String email;

    @Column(nullable = false,unique = true)
    private String cpf;

    @ManyToMany
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;


}
