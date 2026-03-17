package com.biblioteca.modelo;

public class Usuario extends Persona {

    private static final int MAX_LIBROS = 3;
    private int librosPrestados;

    public Usuario(String nombre, String identificacion) {
        super(nombre, identificacion);
        this.librosPrestados = 0;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public boolean puedePrestar() {
        return librosPrestados < MAX_LIBROS;
    }

    public static int getMaxLibros() {
        return MAX_LIBROS;
    }

    public void incrementarPrestamos() {
        librosPrestados++;
    }

    public void decrementarPrestamos() {
        if (librosPrestados > 0) {
            librosPrestados--;
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + identificacion);
        System.out.println("Libros prestados: " + librosPrestados + " / " + MAX_LIBROS);
    }
}
