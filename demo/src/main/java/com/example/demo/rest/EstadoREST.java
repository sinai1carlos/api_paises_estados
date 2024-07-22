package com.example.demo.rest;

import com.example.demo.model.Estado;
import com.example.demo.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estado")
@CrossOrigin(origins = "http://localhost:4200")
public class EstadoREST {

    @Autowired
    private EstadoService estadoService;
    /*
    //1 forma
    @GetMapping
    public ResponseEntity<List<Estado>> getAllEstadosByPais(@RequestParam("idPais") Long idPais) {
        List<Estado> estados = estadoService.findByPaisId(idPais);
        if (estados.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(estados);
    }*/

    //otra forma
    @GetMapping("/{id}")
    public ResponseEntity<List<Estado>> getEstadoById(@PathVariable Long id) {
        List<Estado> estados = estadoService.findByPaisId(id);
        return ResponseEntity.ok(estados);
    }
}
