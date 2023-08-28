package com.example.cargarregistrosredpasiva.repository;

import com.example.cargarregistrosredpasiva.entity.Materializacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterializacionRepository extends JpaRepository<Materializacion, Integer> {
}
