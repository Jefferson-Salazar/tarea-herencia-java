package com.tarea.herencia.libro;

// libro digital hereda de libro
public class LibroDigital extends Libro {
    private double tamanioMB;

    public LibroDigital(String titulo, String autor, double tamanioMB) {
        super(titulo, autor);
        this.tamanioMB = tamanioMB;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("----- LIBRO DIGITAL -----");
        super.mostrarInfo(); // reutilizamos lo del padre
        System.out.println("Tamaño: " + tamanioMB + " MB");
    }
}
