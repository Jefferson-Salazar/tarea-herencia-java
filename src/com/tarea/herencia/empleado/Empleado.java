package com.tarea.herencia.empleado;

// clase base para empleados
public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // metodo para calcular salario
    public double calcularSalario() {
        return salario;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: Q" + calcularSalario());
    }
}
