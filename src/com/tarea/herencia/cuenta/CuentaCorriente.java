package com.tarea.herencia.cuenta;

// esta clase hereda de Cuenta
// aqui se permite retirar usando sobregiro
public class CuentaCorriente extends Cuenta {
    private double limiteSobregiro;

    public CuentaCorriente(double saldo, double limiteSobregiro) {
        super(saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double monto) {
        // aqui validamos si todavia se puede retirar tomando en cuenta el sobregiro
        if (saldo - monto >= -limiteSobregiro) {
            super.retirar(monto);
            System.out.println("Retiro realizado con exito.");
        } else {
            System.out.println("No se puede retirar, se pasa del limite de sobregiro.");
        }
    }
}
