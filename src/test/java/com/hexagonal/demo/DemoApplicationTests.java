package com.hexagonal.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	/*@Test
	public void testMapStructEntityToDto()
	{
		// Crear un objeto User
		User user = new User();
		user.setId(5);
		user.setNombre("Juan Pérez");
		user.setCorreo("juan.perez@example.com");

		// Mapear User a UserDTO
		UserDTO userDTO = UserMapper.INSTANCE.entityToDto(user);

		// Mostrar los datos del DTO
		System.out.println("Name: " + userDTO.getNombre());
		System.out.println("Email: " + userDTO.getCorreo());
		assertEquals(user.getNombre(), userDTO.getNombre());
		assertEquals(user.getCorreo(), userDTO.getCorreo());
	}

	@Test
	public void testMapStructUserDtoToEntity()
	{
		// Crear un objeto User
		UserDTO userDto = new UserDTO();
		userDto.setNombre("Juan Pérez");
		userDto.setCorreo("juan.perez@example.com");

		// Mapear User a UserDTO
		User user = UserMapper.INSTANCE.dtoToEntity(userDto);

		// Mostrar los datos del DTO
		System.out.println("Name: " + user.getNombre());
		System.out.println("Email: " + user.getCorreo());
		assertEquals(userDto.getNombre(), user.getNombre());
		assertEquals(userDto.getCorreo(), user.getCorreo());
	}*/
}
