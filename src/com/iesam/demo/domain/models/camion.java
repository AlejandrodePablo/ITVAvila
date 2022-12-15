package com.iesam.demo.domain.models;

public class camion implements vehiculo {

    public String tara;
    public Integer longitud;

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    @Override
    public String getMatricula() {
        return null;
    }

    @Override
    public String getMarca() {
        return null;
    }

    @Override
    public String getModelo() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public String getAñoMatriculacion() {
        return null;
    }
}

