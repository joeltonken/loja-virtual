package com.estudos.dev.backend.controller;

import com.estudos.dev.backend.dto.PessoaClienteRequestDTO;
import com.estudos.dev.backend.entity.Pessoa;
import com.estudos.dev.backend.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class PessoaClienteController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/")
    public Pessoa inserir(@RequestBody PessoaClienteRequestDTO pessoaClienteRequestDTO){
        Pessoa pessoa = new PessoaClienteRequestDTO().converter(pessoaClienteRequestDTO);
        return pessoaService.inserir(pessoa);
    }
}