/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.proyectousarios.controller;

import com.tendencias.m5b.proyectousarios.model.Persona;
import com.tendencias.m5b.proyectousarios.service.ServicioPersonaImpl;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    ServicioPersonaImpl perSer;

    @Operation(summary = "Se obtiene la lista de persona")
    @GetMapping("/listar")
    public ResponseEntity<List<Persona>> listPer() {

        return new ResponseEntity<>(perSer.findByAll(), HttpStatus.OK);
    }

    @Operation(summary = "Debe enviar los campos persona")
    @PostMapping("/crear")
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona p) {
        return new ResponseEntity<>(perSer.save(p), HttpStatus.CREATED);
    }

    @PutMapping("/actulizar/{id}")
    public ResponseEntity<Persona> actualizarPersona(@PathVariable Integer id, @RequestBody Persona p) {
        Persona per = perSer.findById(id);

        if (per != null) {
            per.setNombre(p.getNombre());
            per.setApellido(p.getApellido());
            per.setCelular(p.getCelular());
            per.setFechaNacimiento(p.getFechaNacimiento());
            per.setInstruccion(p.getInstruccion());

            return new ResponseEntity<>(perSer.save(per), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    public ResponseEntity<Persona> eliminarPersona(@PathVariable Integer id) {
        perSer.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
