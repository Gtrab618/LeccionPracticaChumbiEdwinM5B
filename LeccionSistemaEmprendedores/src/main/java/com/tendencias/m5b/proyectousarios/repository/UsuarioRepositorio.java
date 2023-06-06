/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.proyectousarios.repository;

import com.tendencias.m5b.proyectousarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Usuario
 */
public interface UsuarioRepositorio extends JpaRepository<Usuario,Integer>{
    
    @Query(value="Select * from usuario u where u.nombre=:nombre", nativeQuery= true)
    public Usuario buscarUsuario(String nombre);
}
