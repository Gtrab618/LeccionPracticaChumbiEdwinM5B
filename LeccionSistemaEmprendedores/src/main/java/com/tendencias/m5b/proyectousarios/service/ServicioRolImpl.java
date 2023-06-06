/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.proyectousarios.service;

import com.tendencias.m5b.proyectousarios.model.Rol;
import com.tendencias.m5b.proyectousarios.repository.RolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class ServicioRolImpl extends ServicioGenericoImpl<Rol, Integer> implements ServicioGenerico<Rol, Integer> {
    
    @Autowired
    RolRepositorio usuarioRepo;
    
    @Override
    public CrudRepository<Rol, Integer> getDao() {
    
        return usuarioRepo;
    }

}
