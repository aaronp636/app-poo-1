package model;

import java.time.LocalDate;
import java.util.Calendar;

public class Especialidad {

    private Integer idEspe;
    private Integer nomEspe;
    private Integer estado;
    private LocalDate fechaCrea;

    public Especialidad(Integer idEspe, Integer nomEspe, Integer estado, LocalDate fechaCrea) {
        this.idEspe = idEspe;
        this.nomEspe = nomEspe;
        this.estado = estado;
        this.fechaCrea = fechaCrea;
    }

    public Integer getIdEspe() {
        return idEspe;
    }

    public void setIdEspe(Integer idEspe) {
        this.idEspe = idEspe;
    }

    public Integer getNomEspe() {
        return nomEspe;
    }

    public void setNomEspe(Integer nomEspe) {
        this.nomEspe = nomEspe;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public LocalDate getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(LocalDate fechaCrea) {
        this.fechaCrea = fechaCrea;
    }
}