package com.example.cargarregistrosredpasiva.repository;

import com.example.cargarregistrosredpasiva.entity.Estacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EstacionRepository extends JpaRepository<Estacion, Integer> {

    @Query(value = "insert into main_estacion (identificador, nomenclatura, estado_vertice,  municipio, latitud, longitud, altura_elipsoidal, agencia, geom) values (?,?, ?,?, ?, ?,?, ?, ST_SetSRID(ST_MakePoint(?, ?), 9377)) returning *", nativeQuery = true)
    Estacion saveEstacion(String identificador, String nomenclatura, int estadoVertice, int idMunicipio, double latitud, double longitud, double alturaElipsoidal,  int agencia, double lon, double lat);
}
