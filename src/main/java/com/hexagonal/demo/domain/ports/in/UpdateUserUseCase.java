package com.hexagonal.demo.domain.ports.in;

import com.hexagonal.demo.domain.models.User;

import java.util.Optional;

public interface UpdateUserUseCase {
    Optional<User> updateUser(Long id, User updateUser);
}
