package com.hexagonal.demo.domain.ports.in;

import com.hexagonal.demo.domain.models.User;

import java.util.List;
import java.util.Optional;

public interface RetrieveUserUseCase {
    Optional<User> getUserById(Long id);

    List<User> getAllUsers();
}
