package com.estudos.dev.backend.controllers;

import com.estudos.dev.backend.dtos.PessoaClienteRequestDTO;
import com.estudos.dev.backend.entities.Pessoa;
import com.estudos.dev.backend.services.PessoaClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cliente")
public class PessoaClienteController {

    @Autowired
    private PessoaClienteService pessoaService;

    @PostMapping("/")
    public Pessoa inserir(@RequestBody PessoaClienteRequestDTO pessoaClienteRequestDTO){
        return pessoaService.registrar(pessoaClienteRequestDTO);
    }
}