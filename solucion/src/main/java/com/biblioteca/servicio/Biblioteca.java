package com.biblioteca.servicio;

import com.biblioteca.modelo.Libro;
import com.biblioteca.modelo.Usuario;

public class Biblioteca {

    private static Biblioteca instancia;

    private final LibroService libroService;
    private final UsuarioService usuarioService;

    private Biblioteca() {
        this.libroService  = new LibroService();
        this.usuarioService = new UsuarioService();
    }

    public static synchronized Biblioteca getInstance() {
        if (instancia == null) {
            instancia = new Biblioteca();
        }
        return instancia;
    }

    public void agregarLibro(Libro libro) {
        libroService.agregarLibro(libro);
    }

    public void mostrarLibros() {
        libroService.mostrarCatalogo();
    }

    public boolean prestarLibro(Usuario usuario, Libro libro) {
        return usuarioService.prestarLibro(usuario, libro);
    }

    public void devolverLibro(Usuario usuario, Libro libro) {
        usuarioService.devolverLibro(usuario, libro);
    }
}
