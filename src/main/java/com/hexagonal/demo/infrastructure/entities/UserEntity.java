package com.hexagonal.demo.infrastructure.entities;


import com.hexagonal.demo.domain.models.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "contrasena", nullable = false)
    private String contrasena;

    @Column(name = "edad", nullable = false)
    private Integer edad;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;


    public static UserEntity fromDomainModel(User user) {
        return new UserEntity(
                user.getId(),
                user.getNombre(),
                user.getCorreo(),
                user.getContrasena(),
                user.getEdad(),
                user.getCreatedAt());
    }

//    public static User toDomainModel() {
//        return new User(id, nombre, correo, contrasena, edad, createdAt);
//    }
}
