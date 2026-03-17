package com.biblioteca.modelo;

public class Libro implements Prestable {

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public void prestar() {
        this.disponible = false;
    }

    @Override
    public void devolver() {
        this.disponible = true;
    }

    public void mostrarLibro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }
}
