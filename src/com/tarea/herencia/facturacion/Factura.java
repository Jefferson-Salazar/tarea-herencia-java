package com.tarea.herencia.facturacion;

// clase base factura
public class Factura {
    protected int numero;
    protected Cliente cliente;
    protected double total;

    public Factura(int numero, Cliente cliente, double total) {
        this.numero = numero;
        this.cliente = cliente;
        this.total = total;
    }

    // metodo que se va a sobrescribir
    public double calcularTotal() {
        return total;
    }

    public void mostrar() {
        System.out.println("Numero: " + numero);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("NIT: " + cliente.getNit());
        System.out.println("Total: Q" + calcularTotal());
    }
}
