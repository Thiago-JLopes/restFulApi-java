package com.dio.projeto.apirest.service.imp;

import com.dio.projeto.apirest.model.User;
import com.dio.projeto.apirest.repository.UserRepository;
import com.dio.projeto.apirest.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exists");
        }
        return userRepository.save(userToCreate);
    }
}
