package com.example.startspring.repository;

import com.example.startspring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Estamos falando que esse é um repositorio capaz de interagir com o BD
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}