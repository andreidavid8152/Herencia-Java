package com.example;

public class Moto extends Vehiculo {
    private int cilindrada;
    private String tipoManubrio;

    public Moto(String placa, String color, int anio, int cilindrada, String tipoManubrio) {
        super(placa, color, anio);
        this.cilindrada = cilindrada;
        this.tipoManubrio = tipoManubrio;
    }

    // Getters y setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoManubrio() {
        return tipoManubrio;
    }

    public void setTipoManubrio(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando Moto");
    }

    @Override
    public void estacionarse() {
        System.out.println("Estacionando Moto");
    }
}
