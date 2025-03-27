package com.hexagonal.demo.application.usecases;

import com.hexagonal.demo.domain.models.User;
import com.hexagonal.demo.domain.ports.in.UpdateUserUseCase;
import com.hexagonal.demo.domain.ports.out.UserRepositoryPort;

import java.util.Optional;

public class UpdateUserUseCaseImpl implements UpdateUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public UpdateUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public Optional<User> updateUser(Long id, User updateUser) {
        return userRepositoryPort.update(updateUser);
    }
}
