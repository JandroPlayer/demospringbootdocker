//package com.hexagonal.demo.application.services;
//
//import com.hexagonal.demo.domain.models.User;
//import com.hexagonal.demo.domain.models.UserDTO;
//import com.hexagonal.demo.domain.models.UserMapper;
//import com.hexagonal.demo.infrastructure.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//
//import java.util.List;
//
//@Service
//
//public class UserServiceImpl implements UserServiceIntf {
//
//    @Autowired
//
//    private UserRepository userRepository;
//
//    @Override
//
//    public void saveAll(List <UserDTO> dtoList) {
//
//        List <User> userList = new ArrayList < > ();
//
//        for (UserDTO dto: dtoList) {
//
//            //Use MapStruct for converting DTO to Entity with different data type
//
//            User user = UserMapper.INSTANCE.dtoToEntity(dto);
//
//            userList.add(user);
//
//        }
//
//        userRepository.saveAll(userList);
//
//    }
//
//    @Override
//
//    public List < UserDTO > getAll() {
//
//        List < UserDTO > dtoList = new ArrayList < > ();
//
//        for (User user: userRepository.findAll()) {
//
//            //Use MapStruct for converting Entity to DTO with different data type
//            UserDTO dto = UserMapper.INSTANCE.entityToDto(user);
//
//            dtoList.add(dto);
//
//        }
//
//        return dtoList;
//
//    }
//
//}