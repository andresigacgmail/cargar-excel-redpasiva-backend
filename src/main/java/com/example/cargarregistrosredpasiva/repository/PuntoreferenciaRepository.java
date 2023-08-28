package com.example.cargarregistrosredpasiva.repository;

import com.example.cargarregistrosredpasiva.entity.PuntosReferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntoreferenciaRepository extends JpaRepository<PuntosReferencia, Integer> {
}
