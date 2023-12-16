package com.estudos.dev.backend.repository;

import com.estudos.dev.backend.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
