package com.tarea.herencia.empleado;

// gerente hereda de empleado
// tiene un bono adicional
public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    // modificamos el calculo del salario
    @Override
    public double calcularSalario() {
        return salario + bono;
    }
}
