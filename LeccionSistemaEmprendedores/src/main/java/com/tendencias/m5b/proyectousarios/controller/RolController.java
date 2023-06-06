/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.proyectousarios.controller;

import com.tendencias.m5b.proyectousarios.model.Rol;
import com.tendencias.m5b.proyectousarios.service.ServicioRolImpl;
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
@RequestMapping("/rol")
public class RolController {
    @Autowired
    ServicioRolImpl rolService;
    
    @Operation(summary="Se obtiene la lista de roles")
    @GetMapping("/listar")
    public ResponseEntity<List<Rol>> listRol(){
        
        return new ResponseEntity<>(rolService.findByAll(),HttpStatus.OK);
    }
    
    @Operation(summary="Debe enviar los campos rol")
    @PostMapping("/crear")
    public ResponseEntity<Rol> crearRol(@RequestBody Rol r){
        return new ResponseEntity<>(rolService.save(r), HttpStatus.CREATED);
    }
    
    @PutMapping("/actulizar/{id}")
    public ResponseEntity<Rol> actualizarUsuario(@PathVariable Integer id, @RequestBody Rol r){
        Rol rol = rolService.findById(id);
        
        if(rol!= null){
           
            rol.setRolTipo(r.getRolTipo());
            rol.setDescipion(r.getDescipion());
            rol.setRolEstado(r.isRolEstado());
            
            return new ResponseEntity<>(rolService.save(rol),HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    
    public ResponseEntity<Rol> eliminarRol(@PathVariable Integer id){
        rolService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
