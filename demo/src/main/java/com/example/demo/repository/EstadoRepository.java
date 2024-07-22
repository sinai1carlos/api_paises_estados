package com.example.demo.repository;

import com.example.demo.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstadoRepository extends JpaRepository<Estado,Long> {
    List<Estado> findByPaisId(Long paisId);
}
