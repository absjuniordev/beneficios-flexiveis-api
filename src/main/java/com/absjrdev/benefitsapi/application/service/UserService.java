package com.absjrdev.benefitsapi.application.service;

import com.absjrdev.benefitsapi.api.dto.user.UserRequestDTO;
import com.absjrdev.benefitsapi.api.dto.user.UserResponseDTO;
import com.absjrdev.benefitsapi.domain.user.User;
import com.absjrdev.benefitsapi.domain.user.exception.ExistEmailException;
import com.absjrdev.benefitsapi.domain.user.exception.UserNotFoundException;
import com.absjrdev.benefitsapi.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserRepository userRepository;

    @Transactional

    public UserResponseDTO create(UserRequestDTO request) {

        if (userRepository.existsByEmail(request.email())) {
            throw new ExistEmailException(request.email());
        }

        User user = User.create(
                request.name(),
                request.email(),
                request.password(),
                request.role()
        );

        return UserResponseDTO.from(userRepository.save(user));
    }

    public UserResponseDTO getUserByUsername(String username) {
        var user = userRepository.findByUserName(username).orElseThrow(() -> new UserNotFoundException(username));
        return UserResponseDTO.from(user);
    }


}
