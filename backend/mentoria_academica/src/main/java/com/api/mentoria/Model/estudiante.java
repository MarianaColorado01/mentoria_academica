
package com.api.mentoria.Model;

import jakarta.persistence.*;


/**
 *
 * @author mariana01colorado
 */

@Entity
@Table(name= "estudiantes")
public class estudiante extends usuario{
    
    private String programaAcademico;
    private int semestre;

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
    
    
}
