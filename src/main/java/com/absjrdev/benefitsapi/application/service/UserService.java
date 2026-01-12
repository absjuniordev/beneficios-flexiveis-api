package com.absjrdev.benefitsapi.application.service;

import com.absjrdev.benefitsapi.api.dto.user.UserRequestDTO;
import com.absjrdev.benefitsapi.api.dto.user.UserResponseDTO;
import com.absjrdev.benefitsapi.domain.user.User;
import com.absjrdev.benefitsapi.domain.user.exception.UserEmailExistException;
import com.absjrdev.benefitsapi.domain.user.exception.UserNotFoundException;
import com.absjrdev.benefitsapi.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserRepository userRepository;

    @Transactional
    public UserResponseDTO create(UserRequestDTO request) {

        if (userRepository.existsByEmail(request.email())) {
            throw new UserEmailExistException(request.email());
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

    public List<UserResponseDTO> getAllUsers() {
        List<User> users = userRepository.findAll();

        return users.stream().
                map(UserResponseDTO::from).
                toList();

        //.map(user -> UserResponseDTO.fromE(user))
    }

    public void deleById(long id) {

        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
    }


}
