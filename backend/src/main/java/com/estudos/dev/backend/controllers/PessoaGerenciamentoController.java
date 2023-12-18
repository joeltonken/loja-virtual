package com.estudos.dev.backend.controllers;

import com.estudos.dev.backend.entities.Pessoa;
import com.estudos.dev.backend.services.PessoaGerenciamentoService;
import com.estudos.dev.backend.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pessoa-gerenciamento")
public class PessoaGerenciamentoController {

    @Autowired
    private PessoaGerenciamentoService pessoaGerenciamentoService;

    @PostMapping("/")
    public String recuperarCodigo(@RequestParam ("email") String email){

        return pessoaGerenciamentoService.solicitarCodigo(email);
    }

}