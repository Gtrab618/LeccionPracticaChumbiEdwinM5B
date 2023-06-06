/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.proyectousarios.service;

import com.tendencias.m5b.proyectousarios.model.Usuario;
import com.tendencias.m5b.proyectousarios.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class ServicioUsuarioImpl extends ServicioGenericoImpl<Usuario, Integer>implements ServicioGenerico<Usuario, Integer>{

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

//    public Usuario buscarUsuario(String nombre) {
//        return usuarioRepositorio.buscarUsuario(nombre);
//    }
//    
    @Override
    public CrudRepository<Usuario, Integer> getDao() {

        return usuarioRepositorio;
        
    }
    
}
