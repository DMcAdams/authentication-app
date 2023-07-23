package com.example.loginservice.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="login")
public class LoginEntity {
    @Id
    @Column(name="USERNAME", length=30, nullable=false, unique=true)
    public String username;
    @Column(name="EMAIL", length=50, nullable=false, unique=true)
    public String email;
    @Column(name="PASSWORD", length=35, nullable=false, unique=false)
    public String password;
    @Column(name="FIRST_NAME", length=25, nullable=false, unique=false)
    public String firstName;
    @Column(name="LAST_NAME", length=25, nullable=false, unique=false)
    public String lastName;
}
