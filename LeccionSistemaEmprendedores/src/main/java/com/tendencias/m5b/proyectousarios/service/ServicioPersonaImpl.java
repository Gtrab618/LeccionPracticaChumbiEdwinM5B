/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.proyectousarios.service;

import com.tendencias.m5b.proyectousarios.model.Persona;
import com.tendencias.m5b.proyectousarios.repository.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class ServicioPersonaImpl extends ServicioGenericoImpl<Persona, Integer> implements ServicioGenerico<Persona, Integer> {

    @Autowired
    PersonaRepositorio personaRepo;

    @Override
    public CrudRepository<Persona, Integer> getDao() {

        return personaRepo;
    }

}
