package com.estudos.dev.backend.controller;

import com.estudos.dev.backend.entity.Marca;
import com.estudos.dev.backend.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marca")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @GetMapping("/")
    public List<Marca> buscarTodos(){
        return marcaService.buscarTodos();
    }

    @PostMapping("/")
    public Marca inserir(@RequestBody Marca objeto){
        return marcaService.inserir(objeto);
    }

    @PutMapping("/")
    public Marca alterar(@RequestBody Marca objeto){
        return marcaService.alterar(objeto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        marcaService.excluir(id);
        return ResponseEntity.ok().build();
    }

}