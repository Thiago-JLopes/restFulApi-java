package com.dio.projeto.apirest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Card {
    @Id
    private String number;
    private Float limited = 1200F;
}
