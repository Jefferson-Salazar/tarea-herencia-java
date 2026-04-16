package com.tarea.herencia.vehiculo;

// moto hereda de vehiculo
public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, int velocidad, int cilindrada) {
        super(marca, velocidad);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("----- MOTO -----");
        super.mostrarInfo(); // reutilizamos lo del padre
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
