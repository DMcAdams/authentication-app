package com.example.loginservice.data;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterDto {
    @NotNull
    @Email
    @Size(min=5, max=50)
    private String email;
    @NotNull
    @Size(min = 6, max = 50)
    private String password;
}
