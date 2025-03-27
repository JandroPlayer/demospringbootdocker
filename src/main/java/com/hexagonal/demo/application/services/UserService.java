package com.hexagonal.demo.application.services;

import com.hexagonal.demo.domain.models.User;
import com.hexagonal.demo.domain.ports.in.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements CreateUserUseCase, UpdateUserUseCase, DeleteUserUseCase, RetrieveUserUseCase {

    private final CreateUserUseCase createUserUseCase;
    private final UpdateUserUseCase updateUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;
    private final RetrieveUserUseCase retrieveUserUseCase;

    public UserService(CreateUserUseCase createUserUseCase, UpdateUserUseCase updateUserUseCase, DeleteUserUseCase deleteUserUseCase, RetrieveUserUseCase retrieveUserUseCase) {
        this.createUserUseCase = createUserUseCase;
        this.updateUserUseCase = updateUserUseCase;
        this.deleteUserUseCase = deleteUserUseCase;
        this.retrieveUserUseCase = retrieveUserUseCase;
    }

    public List<User> getAllUsers() {
        return retrieveUserUseCase.getAllUsers();
    }

    public Optional<User> updateUser(Long id, User updateUser) {
        return updateUserUseCase.updateUser(id, updateUser);
    }

    public Optional<User> getUserById(Long id) {
        return retrieveUserUseCase.getUserById(id);
    }

    public User createUser(User user) {
        return createUserUseCase.createUser(user);
    }

    public boolean deleteUser(Long id) {
        return deleteUserUseCase.deleteUser(id);
    }
}
