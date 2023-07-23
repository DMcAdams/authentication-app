package com.example.loginservice.repository;

import com.example.loginservice.data.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<LoginEntity, Long> {
    Optional<LoginEntity> findByEmail(String email);
}
