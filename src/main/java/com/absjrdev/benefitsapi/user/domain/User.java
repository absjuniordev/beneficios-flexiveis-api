package com.absjrdev.benefitsapi.user.domain;

import com.absjrdev.benefitsapi.logOperation.domain.LogOperation;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name ="tb_users" )
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;

    @OneToMany(mappedBy = "users")
    private List<LogOperation> logs;

    protected User() {}

    private User(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public  static User  create(String name, String email, String password, String role){
        return new User(name, email, password, role);
    }

}
