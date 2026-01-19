package com.absjrdev.benefitsapi.user.api;

import com.absjrdev.benefitsapi.user.application.AuthService;
import com.absjrdev.benefitsapi.user.dto.LoginRequestDTO;
import com.absjrdev.benefitsapi.user.dto.LoginResponseDTO;
import com.absjrdev.benefitsapi.user.dto.RegisterRequestDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Void> register(
            @RequestBody @Valid RegisterRequestDTO request
    ) {
        authService.register(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(
            @RequestBody @Valid LoginRequestDTO request
    ) {
        return ResponseEntity.ok(authService.login(request));
    }
}
