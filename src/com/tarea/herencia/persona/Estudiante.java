package com.tarea.herencia.persona;

// esta clase tambien hereda de Persona
// pero en este caso agregamos carnet
public class Estudiante extends Persona {
    private String carnet;

    public Estudiante(String nombre, int edad, String carnet) {
        super(nombre, edad);
        this.carnet = carnet;
    }

    // volvemos a usar override para cambiar el comportamiento
    @Override
    public void mostrar() {
        System.out.println("----- ESTUDIANTE -----");
        super.mostrar(); // usamos el metodo de la clase padre
        System.out.println("Carnet: " + carnet);
    }
}
