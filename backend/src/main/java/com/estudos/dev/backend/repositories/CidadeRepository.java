package com.estudos.dev.backend.repositories;

import com.estudos.dev.backend.entities.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
