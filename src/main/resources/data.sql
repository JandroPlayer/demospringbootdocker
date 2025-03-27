INSERT INTO users (nombre, correo, contrasena, edad, created_at)
SELECT 'Juan Pérez', 'juan.perez@example.com', 'password123', 30, NOW()
WHERE NOT EXISTS (
    SELECT 1 FROM users WHERE correo = 'juan.perez@example.com'
);

INSERT INTO users (nombre, correo, contrasena, edad, created_at)
SELECT 'María López', 'maria.lopez@example.com', 'securepass', 25, NOW()
WHERE NOT EXISTS (
    SELECT 1 FROM users WHERE correo = 'maria.lopez@example.com'
);

INSERT INTO users (nombre, correo, contrasena, edad, created_at)
SELECT 'Carlos Gómez', 'carlos.gomez@example.com', 'strongpass', 35, NOW()
WHERE NOT EXISTS (
    SELECT 1 FROM users WHERE correo = 'carlos.gomez@example.com'
);
