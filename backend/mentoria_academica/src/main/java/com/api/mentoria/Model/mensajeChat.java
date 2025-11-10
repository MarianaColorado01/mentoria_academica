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
@Table(name = "mensajes_chat")
public class mensajeChat {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenido;
    private LocalDateTime fechaEnvio;

    @ManyToOne
    @JoinColumn(name = "id_remitente")
    private usuario remitente;

    @ManyToOne
    @JoinColumn(name = "id_receptor")
    private usuario receptor;

    @ManyToOne
    @JoinColumn(name = "id_sesion")
    private sesionMentoria sesion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public usuario getRemitente() {
        return remitente;
    }

    public void setRemitente(usuario remitente) {
        this.remitente = remitente;
    }

    public usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(usuario receptor) {
        this.receptor = receptor;
    }

    public sesionMentoria getSesion() {
        return sesion;
    }

    public void setSesion(sesionMentoria sesion) {
        this.sesion = sesion;
    }
            
    
    
}
