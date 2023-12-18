package com.estudos.dev.backend.services;

import com.estudos.dev.backend.entities.Pessoa;
import com.estudos.dev.backend.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> buscarTodos() {
        return pessoaRepository.findAll();
    }

    public Pessoa inserir(Pessoa objeto) {
        objeto.setDataCriacao(new Date());
        Pessoa objetoNovo = pessoaRepository.saveAndFlush(objeto);
        return objetoNovo;
    }

    public Pessoa alterar(Pessoa objeto) {
        objeto.setDataAtualizacao(new Date());
        return pessoaRepository.saveAndFlush(objeto);
    }

    public void excluir(Long id) {
        Pessoa objeto = pessoaRepository.findById(id).get();
        pessoaRepository.delete(objeto);
    }
}