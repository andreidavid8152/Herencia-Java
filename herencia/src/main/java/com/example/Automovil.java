package com.example;

public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private String tipoTransmision;

    public Automovil(String placa, String color, int anio, int numeroPuertas, String tipoTransmision) {
        super(placa, color, anio);
        this.numeroPuertas = numeroPuertas;
        this.tipoTransmision = tipoTransmision;
    }

    //Getters y setters
    public int getNumeroPuertas() {
         return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando Automovil");
    }

    @Override
    public void estacionarse() {
        System.out.println("Estacionando Automovil");
    }
}
