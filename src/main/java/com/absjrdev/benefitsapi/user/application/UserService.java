package com.absjrdev.benefitsapi.user.application;

import com.absjrdev.benefitsapi.user.dto.UserRequestDTO;
import com.absjrdev.benefitsapi.user.dto.UserResponseDTO;
import com.absjrdev.benefitsapi.user.domain.User;
import com.absjrdev.benefitsapi.user.domain.exception.UserEmailExistException;
import com.absjrdev.benefitsapi.user.domain.exception.UserNotFoundException;
import com.absjrdev.benefitsapi.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserRepository userRepository;

    @Transactional
    public UserResponseDTO createUser(UserRequestDTO request) {

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

    public UserResponseDTO getUserByUserName(String username) {
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

    public void deleteUserById(long id) {

        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
    }


}
