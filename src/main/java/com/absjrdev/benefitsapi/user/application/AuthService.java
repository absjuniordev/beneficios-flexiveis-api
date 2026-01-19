package com.absjrdev.benefitsapi.user.application;

import com.absjrdev.benefitsapi.user.dto.LoginRequestDTO;
import com.absjrdev.benefitsapi.user.dto.LoginResponseDTO;
import com.absjrdev.benefitsapi.user.dto.RegisterRequestDTO;
import com.absjrdev.benefitsapi.user.domain.User;
import com.absjrdev.benefitsapi.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    // private final JwtService jwtService; // depois

    public void register(RegisterRequestDTO request) {

        User user = User.create(
                request.email(),
                passwordEncoder.encode(request.password()),
                request.role()
        );

        userRepository.save(user);
    }

    public LoginResponseDTO login(LoginRequestDTO request) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.email(),
                        request.password()
                )
        );

        // String token = jwtService.generateToken(user);

        return new LoginResponseDTO("token_aqui_por_enquanto");
    }
}
