package com.iesam.demo.domain.models;

public class Inspeccion {
    public Integer codigoInspeccion;
    public Integer fechaInspeccion;
    public String resultadoInspeccion;
    public vehiculo vehiculo;
    public Propietario proietario;

    public Integer getCodigoInspeccion() {
        return codigoInspeccion;
    }

    public void setCodigoInspeccion(Integer codigoInspeccion) {
        this.codigoInspeccion = codigoInspeccion;
    }

    public Integer getFechaInspeccion() {
        return fechaInspeccion;
    }

    public void setFechaInspeccion(Integer fechaInspeccion) {
        this.fechaInspeccion = fechaInspeccion;
    }

    public String getResultadoInspeccion() {
        return resultadoInspeccion;
    }

    public void setResultadoInspeccion(String resultadoInspeccion) {
        this.resultadoInspeccion = resultadoInspeccion;
    }

    public com.iesam.demo.domain.models.vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(com.iesam.demo.domain.models.vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Propietario getProietario() {
        return proietario;
    }

    public void setProietario(Propietario proietario) {
        this.proietario = proietario;
    }
}
