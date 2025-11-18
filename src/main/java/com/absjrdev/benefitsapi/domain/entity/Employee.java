package com.absjrdev.benefitsapi.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="tb_employee")
public class Employee {
    private Integer id;
    private String name;
    private LocalDate dateBirth;
    private String phone;
    private String email;

}
