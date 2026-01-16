package com.absjrdev.benefitsapi.logOperation.domain;

import com.absjrdev.benefitsapi.user.domain.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_logs_operation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogOperation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String action;

    private LocalDateTime dateTime = LocalDateTime.now();

    private String details;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
