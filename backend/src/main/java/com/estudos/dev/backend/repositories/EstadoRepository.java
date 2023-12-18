package com.estudos.dev.backend.repositories;

import com.estudos.dev.backend.entities.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
