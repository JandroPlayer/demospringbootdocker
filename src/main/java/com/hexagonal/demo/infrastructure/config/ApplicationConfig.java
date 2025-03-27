package com.hexagonal.demo.infrastructure.config;

import com.hexagonal.demo.application.services.UserService;
import com.hexagonal.demo.application.usecases.CreateUserUseCaseImpl;
import com.hexagonal.demo.application.usecases.DeleteUserUseCaseImpl;
import com.hexagonal.demo.application.usecases.RetrieveUserCaseImpl;
import com.hexagonal.demo.application.usecases.UpdateUserUseCaseImpl;
import com.hexagonal.demo.domain.ports.out.UserRepositoryPort;
import com.hexagonal.demo.infrastructure.repositories.JpaUserRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {


    @Bean
    public UserService userService(UserRepositoryPort userRepositoryPort) {
        return new UserService(
                        new CreateUserUseCaseImpl(userRepositoryPort),
                new UpdateUserUseCaseImpl(userRepositoryPort),
                new DeleteUserUseCaseImpl(userRepositoryPort),
                new RetrieveUserCaseImpl(userRepositoryPort)
                );
    }

    @Bean
    public UserRepositoryPort userRepositoryPort(JpaUserRepositoryAdapter jpaUserRepositoryAdapter) {
        return jpaUserRepositoryAdapter;
    }
}
