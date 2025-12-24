package com.absjrdev.benefitsapi.application.service;

import com.absjrdev.benefitsapi.api.dto.user.UserResponseDTO;
import com.absjrdev.benefitsapi.domain.user.User;
import com.absjrdev.benefitsapi.domain.user.exception.UserNotFoundException;
import com.absjrdev.benefitsapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public UserResponseDTO getUserByUsername(String username) {
        var user = userRepository.findByUserName(username).orElseThrow(() -> new UserNotFoundException("Usuário não encontrado"));
        return toResponse(user);
    }

    private UserResponseDTO toResponse(User user) {
        return new UserResponseDTO(
                user.getId(),
                user.getEmail(),
                user.getRole()
        );
    }

}
