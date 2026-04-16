package com.tarea.herencia.persona;

// Esta es la clase base (padre)
// aquí guardamos los datos comunes de cualquier persona
public class Persona {
    protected String nombre;
    protected int edad;

    // constructor para inicializar los datos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // metodo para mostrar la informacion
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
