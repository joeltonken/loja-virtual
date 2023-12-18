package com.estudos.dev.backend.repository;

import com.estudos.dev.backend.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

    List<Permissao> findByNome(String nome);

}
