package com.dio.projeto.apirest.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;
    @Column(precision = 10, scale = 2)
    private BigDecimal balance;
    @Column(name = "ad_limited",precision = 10, scale = 2)
    private BigDecimal limited;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimited() {
        return limited;
    }

    public void setLimited(BigDecimal limited) {
        this.limited = limited;
    }
}
