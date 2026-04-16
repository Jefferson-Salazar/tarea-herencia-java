package com.tarea.herencia.producto;

// clase base para productos
public class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: Q" + precio);
    }
}
