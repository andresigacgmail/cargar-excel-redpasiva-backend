package com.example.cargarregistrosredpasiva.controllers;

import com.example.cargarregistrosredpasiva.dto.PasivaDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pasiva")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PasivaController {


    @GetMapping
    public String respuesta(){
        return "llega";
    }

    @PostMapping
    public ResponseEntity<PasivaDto> saveStation(@RequestBody List<PasivaDto> pasivaDto){
        System.out.println("objeto" + pasivaDto.get(0).getEstacion());
        return new ResponseEntity<>(pasivaDto.get(0), HttpStatus.CREATED);
    }
}
