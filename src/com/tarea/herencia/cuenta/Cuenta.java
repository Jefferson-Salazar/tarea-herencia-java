package com.tarea.herencia.cuenta;

// clase base para manejar un saldo
public class Cuenta {
    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: Q" + saldo);
    }
}
