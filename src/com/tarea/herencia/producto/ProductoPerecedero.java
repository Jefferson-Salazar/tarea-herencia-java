package com.tarea.herencia.producto;

import java.time.LocalDate;

// esta clase hereda de producto
public class ProductoPerecedero extends Producto {
    private LocalDate fechaVencimiento;

    public ProductoPerecedero(String nombre, double precio, LocalDate fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    // este metodo revisa si el producto ya vencio
    public boolean estaVencido() {
        return fechaVencimiento.isBefore(LocalDate.now());
    }

    @Override
    public void mostrarInfo() {
        System.out.println("----- PRODUCTO PERECEDERO -----");
        super.mostrarInfo();
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
        System.out.println("¿Esta vencido?: " + (estaVencido() ? "Si" : "No"));
    }
}
