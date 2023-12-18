package com.estudos.dev.backend.repository;

import com.estudos.dev.backend.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaClienteRepository extends JpaRepository<Pessoa, Long> {
}
