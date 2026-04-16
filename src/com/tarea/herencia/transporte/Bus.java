package com.tarea.herencia.transporte;

// bus hereda de transporte
public class Bus extends Transporte {
    private String ruta;

    public Bus(int capacidad, String ruta) {
        super(capacidad);
        this.ruta = ruta;
    }

    @Override
    public void descripcion() {
        System.out.println("----- BUS -----");
        super.descripcion(); // usamos lo del padre
        System.out.println("Ruta: " + ruta);
    }
}
