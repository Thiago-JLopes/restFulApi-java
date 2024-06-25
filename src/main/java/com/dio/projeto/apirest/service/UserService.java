package com.dio.projeto.apirest.service;

import com.dio.projeto.apirest.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
