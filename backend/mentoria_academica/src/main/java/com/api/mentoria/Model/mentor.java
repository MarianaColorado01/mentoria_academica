/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.mentoria.Model;

import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author mariana01colorado
 */


@Entity
@Table(name ="mentores")
public class mentor extends usuario {
    private String especiabilidad;
    private int experiencia;
    private String disponibilidad;
    
    @OneToMany(mappedBy = "mentor", cascade = CascadeType.ALL)
    private List<agenda> agendas;

    public String getEspeciabilidad() {
        return especiabilidad;
    }

    public void setEspeciabilidad(String especiabilidad) {
        this.especiabilidad = especiabilidad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public List<agenda> getAgendas() {
        return agendas;
    }

    public void setAgendas(List<agenda> agendas) {
        this.agendas = agendas;
    }
    
    
    
}
