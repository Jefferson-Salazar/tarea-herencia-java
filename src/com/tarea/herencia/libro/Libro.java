package com.tarea.herencia.libro;

// clase base libro
public class Libro {
    protected String titulo;
    protected String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
