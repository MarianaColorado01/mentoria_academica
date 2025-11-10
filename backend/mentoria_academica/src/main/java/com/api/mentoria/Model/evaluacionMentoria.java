/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.mentoria.Model;

import jakarta.persistence.*;

/**
 *
 * @author mariana01colorado
 */

@Entity
@Table(name = "evaluaciones")
public class evaluacionMentoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int calificacion;
    private String comentarios;

    @OneToOne
    @JoinColumn(name = "id_sesion")
    private sesionMentoria sesion;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private estudiante estudiante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public sesionMentoria getSesion() {
        return sesion;
    }

    public void setSesion(sesionMentoria sesion) {
        this.sesion = sesion;
    }

    public estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    
    
    
}
