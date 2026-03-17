package com.biblioteca.main;

import com.biblioteca.modelo.*;
import com.biblioteca.servicio.Biblioteca;

public class Main {

    public static void main(String[] args) {

        //Singleton: ambas referencias apuntan al mismo objeto
        Biblioteca biblioteca  = Biblioteca.getInstance();
        Biblioteca biblioteca2 = Biblioteca.getInstance();
        System.out.println("¿Misma instancia? " + (biblioteca == biblioteca2));

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro libro4 = new Libro("1984", "George Orwell");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);

        Usuario      usuario = new Usuario("Carlos Pérez", "123");
        Bibliotecario admin  = new Bibliotecario("Ana Torres", "999", 2_500_000);

        System.out.println("\n======= Catalogo inicial =======");
        biblioteca.mostrarLibros();

        System.out.println("\n======= Prestamos =======");
        biblioteca.prestarLibro(usuario, libro1);
        biblioteca.prestarLibro(usuario, libro2);
        biblioteca.prestarLibro(usuario, libro3);

        System.out.println("\n--- Intento de superar limite ---");
        biblioteca.prestarLibro(usuario, libro4); 

        System.out.println("\n--- Intento de prestar libro no disponible ---");
        Usuario usuario2 = new Usuario("Laura Gómez", "456");
        biblioteca.prestarLibro(usuario2, libro1);

        System.out.println("\n======= Devolucion =======");
        biblioteca.devolverLibro(usuario, libro1);

        System.out.println("\n--- Préstamo tras devolución ---");
        biblioteca.prestarLibro(usuario, libro4);

        System.out.println("\n======= Catalogo final =======");
        biblioteca.mostrarLibros();

        System.out.println("\n===== Usuario =====");
        usuario.mostrarInformacion();

        System.out.println("\n===== Bibliotecario =====");
        admin.mostrarInformacion();
    }
}
