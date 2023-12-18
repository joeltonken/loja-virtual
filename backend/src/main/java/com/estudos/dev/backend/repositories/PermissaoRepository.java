package com.estudos.dev.backend.repositories;

import com.estudos.dev.backend.entities.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

    List<Permissao> findByNome(String nome);

}
