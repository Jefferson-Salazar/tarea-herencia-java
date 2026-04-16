package com.tarea.herencia;

import com.tarea.herencia.persona.Docente;
import com.tarea.herencia.persona.Estudiante;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EJERCICIO 1 ===");

        // creamos objetos para probar
        Docente docente1 = new Docente("Carlos Lopez", 45, "Programacion");
        Estudiante estudiante1 = new Estudiante("Ana Perez", 20, "2025001");

        // llamamos los metodos
        docente1.mostrar();
        System.out.println();

        estudiante1.mostrar();
    }
}