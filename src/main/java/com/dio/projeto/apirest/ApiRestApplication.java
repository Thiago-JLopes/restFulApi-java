package com.dio.projeto.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiRestApplication {
    public String PORT = System.getenv("PORT");
    public static void main(String[] args) {
        SpringApplication.run(ApiRestApplication.class, args);
    }

}
