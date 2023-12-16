package com.estudos.dev.backend.repository;

import com.estudos.dev.backend.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
