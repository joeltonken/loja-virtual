package com.estudos.dev.backend.repositories;

import com.estudos.dev.backend.entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
