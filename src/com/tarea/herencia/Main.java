package com.tarea.herencia;

import com.tarea.herencia.persona.Docente;
import com.tarea.herencia.persona.Estudiante;
import com.tarea.herencia.cuenta.CuentaCorriente;
import com.tarea.herencia.animal.Perro;
import com.tarea.herencia.empleado.Empleado;
import com.tarea.herencia.empleado.Gerente;
import com.tarea.herencia.vehiculo.Moto;
import com.tarea.herencia.transporte.Bus;
import com.tarea.herencia.producto.ProductoPerecedero;
import java.time.LocalDate;
import com.tarea.herencia.figura.Rectangulo;
import com.tarea.herencia.figura.Circulo;
import com.tarea.herencia.libro.LibroDigital;
import com.tarea.herencia.facturacion.Cliente;
import com.tarea.herencia.facturacion.FacturaContado;
import com.tarea.herencia.facturacion.FacturaCredito;

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
        
        
        
        System.out.println("\n=== EJERCICIO 6 ===");

        // probamos el bus
        Bus bus1 = new Bus(40, "Zona 1 - Zona 10");
        bus1.descripcion();
        
        
        
        System.out.println("\n=== EJERCICIO 7 ===");

        // probamos producto perecedero
        ProductoPerecedero producto1 = new ProductoPerecedero("Leche", 12.50, LocalDate.of(2026, 4, 10));
        ProductoPerecedero producto2 = new ProductoPerecedero("Yogurt", 8.75, LocalDate.of(2026, 4, 25));

        producto1.mostrarInfo();
        System.out.println();

        producto2.mostrarInfo();
        
        
        
        System.out.println("\n=== EJERCICIO 8 ===");

        // probamos figuras
        Rectangulo rect1 = new Rectangulo(5, 10);
        Circulo circ1 = new Circulo(7);

        System.out.println("Area del rectangulo: " + rect1.calcularArea());
        System.out.println("Area del circulo: " + circ1.calcularArea());
        
        
        
        System.out.println("\n=== EJERCICIO 9 ===");

        // probamos libro digital
        LibroDigital libro1 = new LibroDigital("Java Basico", "Juan Perez", 5.5);
        libro1.mostrarInfo();
        
        System.out.println("\n=== EJERCICIO 10 ===");

     // creamos cliente
     Cliente cliente1 = new Cliente("Juan Lopez", "1234567-8");

     // factura al contado
     FacturaContado f1 = new FacturaContado(1, cliente1, 1000, 100);
     f1.mostrar();

     System.out.println();

     // factura a credito
     FacturaCredito f2 = new FacturaCredito(2, cliente1, 1000, 200, 4);
     f2.mostrar();
     f2.mostrarCuotas();
     
    }
}