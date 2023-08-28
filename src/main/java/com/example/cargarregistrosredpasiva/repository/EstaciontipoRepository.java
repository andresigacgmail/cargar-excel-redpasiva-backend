package com.example.cargarregistrosredpasiva.repository;

import com.example.cargarregistrosredpasiva.entity.EstacionTipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstaciontipoRepository extends JpaRepository<EstacionTipo, Integer> {

}
