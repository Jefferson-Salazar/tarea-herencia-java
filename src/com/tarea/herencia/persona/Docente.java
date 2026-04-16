package com.tarea.herencia.persona;

// esta clase hereda de Persona
// agrega una especialidad
public class Docente extends Persona {
    private String especialidad;

    // usamos super para llamar al constructor de la clase padre
    public Docente(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    // aqui estamos modificando el metodo mostrar de Persona
    @Override
    public void mostrar() {
        System.out.println("----- DOCENTE -----");
        super.mostrar(); // reutilizamos lo que ya hace Persona
        System.out.println("Especialidad: " + especialidad);
    }
}
