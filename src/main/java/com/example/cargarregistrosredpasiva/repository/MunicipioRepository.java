package com.example.cargarregistrosredpasiva.repository;


import com.example.cargarregistrosredpasiva.entity.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Integer> {

    Municipio findMunicipioByNombre(String nombre);
}
