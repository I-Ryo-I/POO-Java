package com.biblioteca.servicio;

import com.biblioteca.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

public class LibroService {

    private final List<Libro> catalogo;

    public LibroService() {
        this.catalogo = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
    }

    public List<Libro> getLibrosDisponibles() {
        List<Libro> disponibles = new ArrayList<>();
        for (Libro l : catalogo) {
            if (l.isDisponible()) disponibles.add(l);
        }
        return disponibles;
    }

    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
            return;
        }
        for (Libro libro : catalogo) {
            libro.mostrarLibro();
            System.out.println("---------------");
        }
    }
}
