package com.example;

public abstract class Vehiculo {
    private String placa;
    private String color;
    private int anio;

    public Vehiculo(String placa, String color, int anio) {
        this.placa = placa;
        this.color = color;
        this.anio = anio;
    }

    //Getters y setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public abstract void acelerar();

    public abstract void estacionarse();
}
