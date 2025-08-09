package com.example.Backend2.models;

import com.example.Backend2.helpers.EstadoAsistencia;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "asistencia")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @Column(name = "observacion", nullable = false)
    private String observacion;
    @Column(name = "EstadoAsistencia", nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoAsistencia estado;

    public Asistencia() {
    }

    public Asistencia(Integer id, LocalDate fecha, String observacion, EstadoAsistencia estado) {
        this.id = id;
        this.fecha = fecha;
        this.observacion = observacion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public EstadoAsistencia getEstado() {
        return estado;
    }

    public void setEstado(EstadoAsistencia estado) {
        this.estado = estado;
    }
}
