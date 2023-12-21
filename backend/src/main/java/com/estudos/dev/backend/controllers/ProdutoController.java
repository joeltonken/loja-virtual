package com.estudos.dev.backend.controllers;

import com.estudos.dev.backend.entities.Produto;
import com.estudos.dev.backend.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
@CrossOrigin
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/")
    public List<Produto> buscarTodos(){
        return produtoService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable("id") Long id){
        return produtoService.buscarPorId(id);
    }

    @PostMapping("/")
    public Produto inserir(@RequestBody Produto objeto){
        return produtoService.inserir(objeto);
    }

    @PutMapping("/")
    public Produto alterar(@RequestBody Produto objeto){
        return produtoService.alterar(objeto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        produtoService.excluir(id);
        return ResponseEntity.ok().build();
    }

}