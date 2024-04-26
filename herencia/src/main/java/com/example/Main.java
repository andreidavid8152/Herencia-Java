package com.example;

public class Main {
    public static void main(String[] args) {
        
        // Instancia moto
        Moto miMoto = new Moto("ABC123", "Rojo", 2020, 250, "Deportivo");
        // Metodos de moto
        miMoto.acelerar();
        miMoto.estacionarse();

        // Imprimir detalles de la Moto
        System.out.println("Detalles de la Moto:");
        System.out.println("Placa: " + miMoto.getPlaca());
        System.out.println("Color: " + miMoto.getColor());
        System.out.println("Año: " + miMoto.getAnio());
        System.out.println("Cilindrada: " + miMoto.getCilindrada());
        System.out.println("Tipo de Manubrio: " + miMoto.getTipoManubrio());

        // Instancia automovil
        Automovil miAutomovil = new Automovil("XYZ789", "Azul", 2021, 4, "Automática");
        // Métodos de Automovil
        miAutomovil.acelerar();
        miAutomovil.estacionarse();

        // Imprimir detalles del Automovil
        System.out.println("\nDetalles del Automovil:");
        System.out.println("Placa: " + miAutomovil.getPlaca());
        System.out.println("Color: " + miAutomovil.getColor());
        System.out.println("Año: " + miAutomovil.getAnio());
        System.out.println("Número de Puertas: " + miAutomovil.getNumeroPuertas());
        System.out.println("Tipo de Transmisión: " + miAutomovil.getTipoTransmision());
    }
}