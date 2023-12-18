package com.estudos.dev.backend.repositories;

import com.estudos.dev.backend.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
