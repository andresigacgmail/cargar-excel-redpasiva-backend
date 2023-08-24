package com.example.cargarregistrosredpasiva.controllers;

import com.example.cargarregistrosredpasiva.dto.PasivaDto;
import com.example.cargarregistrosredpasiva.entity.Municipio;
import com.example.cargarregistrosredpasiva.repository.MunicipioRepository;
import com.example.cargarregistrosredpasiva.service.PasivaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pasiva")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PasivaController {

    @Autowired private PasivaService pasivaService;
    @Autowired private MunicipioRepository municipioRepository;

    @GetMapping
    public String respuesta(){
        return "llega";
    }

    @PostMapping
    public ResponseEntity<PasivaDto> saveStation(@RequestBody List<PasivaDto> pasivaDto){
        return new ResponseEntity<>(pasivaService.procesarPasiva(pasivaDto), HttpStatus.CREATED);
    }

    @GetMapping("/municipio")
    public ResponseEntity<List<Municipio>> findAll(){
        return ResponseEntity.ok(municipioRepository.findAll());
    }
}
