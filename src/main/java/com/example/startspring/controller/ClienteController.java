package com.example.startspring.controller;

import com.example.startspring.model.Cliente;
import com.example.startspring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired //Adiciona uma instancia automaticamente
    //Seria como se fosse ClienteRepository clienteRepository = new ClienteRepository();
    private ClienteRepository clienteRepository;
    @GetMapping // Estou mapeando para o HTTP identificar que tem que chamar o metodo hello
    public List<Cliente> listar(){
       return clienteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }


}
