/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.mentoria.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 *
 * @author mariana01colorado
 */

@Entity
@Table(name = "recomendaciones")
public class recomendacionMentor {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String razon;
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "id_mentor")
    private mentor mentor;

    @ManyToOne
    @JoinColumn(name = "id_coordinador")
    private coordinador coordinador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public mentor getMentor() {
        return mentor;
    }

    public void setMentor(mentor mentor) {
        this.mentor = mentor;
    }

    public coordinador getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(coordinador coordinador) {
        this.coordinador = coordinador;
    }
    
    
    
    
}
