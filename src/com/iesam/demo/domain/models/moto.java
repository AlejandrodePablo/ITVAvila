package com.iesam.demo.domain.models;

public class moto implements vehiculo{
    public String matricula ;
    public String marca;
    public String modelo;
    public String color;
    public String añoMatriculacion;
    public Integer diametroRuedas;

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

    public Integer getDiametroRuedas() {
        return diametroRuedas;
    }

    public void setDiametroRuedas(Integer diametroRuedas) {
        this.diametroRuedas = diametroRuedas;
    }
}
