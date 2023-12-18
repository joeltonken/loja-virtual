package com.estudos.dev.backend.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.dev.backend.dto.PessoaClienteRequestDTO;
import com.estudos.dev.backend.entity.Pessoa;
import com.estudos.dev.backend.repository.PessoaClienteRepository;

@Service
public class PessoaClienteService {

    @Autowired
    private PessoaClienteRepository pessoaRepository;

    @Autowired
    private PermissaoPessoaService permissaoPessoaService;

    @Autowired
    private EmailService emailService;

    public Pessoa registrar(PessoaClienteRequestDTO pessoaClienteRequestDTO) {
        Pessoa pessoa = new PessoaClienteRequestDTO().converter(pessoaClienteRequestDTO);
        pessoa.setDataCriacao(new Date());
        Pessoa objetoNovo = pessoaRepository.saveAndFlush(pessoa);
        permissaoPessoaService.vincularPessoaPermissaoCliente(objetoNovo);
        emailService.enviarEmailTexto(objetoNovo.getEmail(), "Cadastro na Loja Virtual do Jojo", "O registro na loja foi realizado com sucesso. Em breve você receberá a senha de acesso por e-mail!!");
        return objetoNovo;
    }



}