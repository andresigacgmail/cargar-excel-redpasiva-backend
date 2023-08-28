package com.example.cargarregistrosredpasiva.repository;

import com.example.cargarregistrosredpasiva.entity.MaterializacionTipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterializaciontipoRepository extends JpaRepository<MaterializacionTipo, Integer> {

    MaterializacionTipo findMaterializacionTipoByDispname(String name);
}
