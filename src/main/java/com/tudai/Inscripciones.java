package com.tudai;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
public class Inscripciones {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Estudiante dni;
    @ManyToOne(fetch = FetchType.LAZY)
    private Carrera id_carrera;
    @Column
    private boolean graduado;
    @Column
    private Timestamp fechaInscripcion;
    @Column
    private int antiguedad;

    public Inscripciones(){}

    public Inscripciones(Estudiante dni, Carrera id_carrera, boolean graduado, Timestamp fechaInscripcion) {
        this.dni = dni;
        this.id_carrera = id_carrera;
        this.graduado = graduado;
        this.fechaInscripcion = fechaInscripcion;
    }

    public int getId() {
        return id;
    }

    public Estudiante getDni() {
        return dni;
    }

    public void setDni(Estudiante dni) {
        this.dni = dni;
    }

    public Carrera getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(Carrera id_carrera) {
        this.id_carrera = id_carrera;
    }

    public boolean isGraduado() {
        return graduado;
    }

    public void setGraduado(boolean graduado) {
        this.graduado = graduado;
    }

    public Timestamp getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Timestamp fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Inscripciones{" +
                "id=" + id +
                ", dni=" + dni +
                ", id_carrera=" + id_carrera +
                ", graduado=" + graduado +
                ", fechaInscripcion=" + fechaInscripcion +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
