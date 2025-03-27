package com.hexagonal.demo.application.usecases;

import com.hexagonal.demo.domain.ports.in.DeleteUserUseCase;
import com.hexagonal.demo.domain.ports.out.UserRepositoryPort;

public class DeleteUserUseCaseImpl implements DeleteUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public DeleteUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public boolean deleteUser(Long id) {
        return userRepositoryPort.deleteById(id);
    }
}
