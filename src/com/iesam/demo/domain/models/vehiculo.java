package com.iesam.demo.domain.models;

public interface vehiculo {
    public String matricula;
    public String marca;
    public String modelo;
    public String color;
    public String añoMatriculacion;

    public String getMatricula() {
        return matricula;

    }
    public String getMarca() {
        return marca;

    }
    public String getModelo() {
        return modelo;

    }
    public String getColor() {
        return color;

    }
    public String getAñoMatriculacion() {
        return añoMatriculacion;

    }
}