package com.example.startspring.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;


@Data // Lombok getter e setters
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String nome;

}
