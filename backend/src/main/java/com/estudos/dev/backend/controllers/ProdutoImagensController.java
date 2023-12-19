package com.estudos.dev.backend.controllers;

import com.estudos.dev.backend.entities.ProdutoImagens;
import com.estudos.dev.backend.services.ProdutoImagensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/produtoImagens")
public class ProdutoImagensController {

    @Autowired
    private ProdutoImagensService produtoImagensService;

    @GetMapping("/")
    public List<ProdutoImagens> buscarTodos(){
        return produtoImagensService.buscarTodos();
    }

    @GetMapping("/produto/{id}")
    public List<ProdutoImagens> buscarPorProduto(@PathVariable("id") Long idProduto){
        return produtoImagensService.buscarPorProduto(idProduto);
    }

    @PostMapping("/")
    public ProdutoImagens inserir(@RequestParam("idProduto") Long idProduto,
                                  @RequestParam("file") MultipartFile file){
        return produtoImagensService.inserir(idProduto,file);
    }

    @PutMapping("/")
    public ProdutoImagens alterar(@RequestBody ProdutoImagens objeto){
        return produtoImagensService.alterar(objeto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        produtoImagensService.excluir(id);
        return ResponseEntity.ok().build();
    }

}