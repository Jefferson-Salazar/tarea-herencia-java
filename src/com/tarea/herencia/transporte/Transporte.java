package com.tarea.herencia.transporte;

// clase base para transporte
public class Transporte {
    protected int capacidad;

    public Transporte(int capacidad) {
        this.capacidad = capacidad;
    }

    // metodo para describir el transporte
    public void descripcion() {
        System.out.println("Capacidad: " + capacidad + " personas");
    }
}
