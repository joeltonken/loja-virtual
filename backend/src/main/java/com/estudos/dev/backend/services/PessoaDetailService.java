package com.estudos.dev.backend.services;

import com.estudos.dev.backend.entities.Pessoa;
import com.estudos.dev.backend.repositories.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PessoaDetailService implements UserDetailsService{

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Pessoa pessoa = pessoaRepository.findByEmail(username);
        if(pessoa==null){
            throw new UsernameNotFoundException("Pessoa não encontrada pelo email");
        }
        return pessoa;
    }

}