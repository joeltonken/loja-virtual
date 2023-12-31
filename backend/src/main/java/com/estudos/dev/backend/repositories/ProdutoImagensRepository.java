package com.estudos.dev.backend.repositories;

import com.estudos.dev.backend.entities.ProdutoImagens;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoImagensRepository extends JpaRepository<ProdutoImagens, Long> {

    public List<ProdutoImagens> findByProdutoId(Long id);

}
