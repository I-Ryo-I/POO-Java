package com.biblioteca.servicio;

import com.biblioteca.modelo.Libro;
import com.biblioteca.modelo.Usuario;

public class UsuarioService {

    public boolean prestarLibro(Usuario usuario, Libro libro) {
        if (!libro.isDisponible()) {
            System.out.println("El libro " + libro.getTitulo() + " no está disponible.");
            return false;
        }

        if (!usuario.puedePrestar()) {
            System.out.println("El usuario " + usuario.getNombre() + " ya tiene el máximo de " + Usuario.getMaxLibros()+ " libros prestados. Devuelva uno antes de solicitar otro.");
            return false;
        }
        
        libro.prestar();
        usuario.incrementarPrestamos();
        System.out.println("Prestamo exitoso: " + libro.getTitulo()+ " → " + usuario.getNombre());
        return true;
    }

    public void devolverLibro(Usuario usuario, Libro libro) {
        if (libro.isDisponible()) {
            System.out.println("El libro " + libro.getTitulo()+ " ya estaba disponible. No se registra devolución.");
            return;
        }
        libro.devolver();
        usuario.decrementarPrestamos();
        System.out.println("Devolucion registrada: " + libro.getTitulo()+ " ← " + usuario.getNombre());
    }
}
