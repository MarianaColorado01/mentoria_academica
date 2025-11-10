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
@Table(name = "sesiones_mentoria")
public class sesionMentoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaHora;
    private String estado; // Pendiente, Confirmada, Finalizada
    private String enlace;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "id_mentor")
    private mentor mentor;

    @OneToOne(mappedBy = "sesion", cascade = CascadeType.ALL)
    private evaluacionMentoria evaluacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
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

    public evaluacionMentoria getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(evaluacionMentoria evaluacion) {
        this.evaluacion = evaluacion;
    }
    
    
    
}
