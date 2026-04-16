package com.tarea.herencia;

import com.tarea.herencia.persona.Docente;
import com.tarea.herencia.persona.Estudiante;
import com.tarea.herencia.cuenta.CuentaCorriente;
import com.tarea.herencia.animal.Perro;
import com.tarea.herencia.empleado.Empleado;
import com.tarea.herencia.empleado.Gerente;
import com.tarea.herencia.vehiculo.Moto;

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

        System.out.println("\n=== EJERCICIO 2 ===");

        // probamos una cuenta corriente con sobregiro
        CuentaCorriente cuenta1 = new CuentaCorriente(500, 300);

        cuenta1.mostrarSaldo();

        System.out.println("Retirando Q200...");
        cuenta1.retirar(200);
        cuenta1.mostrarSaldo();

        System.out.println("Retirando Q500...");
        cuenta1.retirar(500);
        cuenta1.mostrarSaldo();

        System.out.println("Retirando Q200...");
        cuenta1.retirar(200);
        cuenta1.mostrarSaldo();
        
        System.out.println("\n=== EJERCICIO 3 ===");

        // probamos la clase perro
        Perro perro1 = new Perro();
        perro1.hacerSonido();
     
        System.out.println("\n=== EJERCICIO 4 ===");

        // probamos empleado normal
        Empleado emp1 = new Empleado("Luis", 3000);
        emp1.mostrar();

        System.out.println();

        // probamos gerente con bono
        Gerente gerente1 = new Gerente("Maria", 4000, 1500);
        gerente1.mostrar();
  
        System.out.println("\n=== EJERCICIO 5 ===");

        //probamos la moto
        Moto moto1 = new Moto("Yamaha", 180, 600);
        moto1.mostrarInfo();
     
     
    }
}