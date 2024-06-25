package com.dio.projeto.apirest.repository;

import com.dio.projeto.apirest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    boolean existsByAccountNumber(String accountNumber);
}
