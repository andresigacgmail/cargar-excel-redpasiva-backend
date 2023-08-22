package com.example.cargarregistrosredpasiva.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pasiva")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PasivaController {


    @GetMapping
    public String respuesta(){
        return "llega";
    }
}
