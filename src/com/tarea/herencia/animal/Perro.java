package com.tarea.herencia.animal;

// perro hereda de animal
public class Perro extends Animal {

    // aqui cambiamos el comportamiento del metodo
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: guau guau");
    }
}