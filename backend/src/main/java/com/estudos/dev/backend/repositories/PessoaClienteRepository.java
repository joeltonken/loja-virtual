package com.estudos.dev.backend.repositories;

import com.estudos.dev.backend.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaClienteRepository extends JpaRepository<Pessoa, Long> {
}
