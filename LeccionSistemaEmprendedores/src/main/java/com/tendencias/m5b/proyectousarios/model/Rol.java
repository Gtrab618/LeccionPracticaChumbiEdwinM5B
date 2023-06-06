
package com.tendencias.m5b.proyectousarios.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Usuario
 */
@Data 
@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_rol")
    private int idRol;
    
    
    @NotBlank(message="Alerta tipo de usuario vacio")
    private String RolTipo;
    
    private boolean RolEstado;
    private String descipion;
    
    @JsonIgnore
    @OneToMany(mappedBy="rol")
    private List<Usuario> listaUsu;
    
    
}
