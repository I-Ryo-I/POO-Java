// Java
public class Personaje {
    private String nombre;
    private int vida;
    public void atacar(Personaje objetivo) { ... }
    public void recibirDano(int cantidad) { ... }
}

public class PersonajeRenderer {
    public void mostrarEnPantalla(Personaje p) { ... }
}

public class PersonajeRepositorio {
    public void guardarEnBaseDeDatos(Personaje p) { ... }
}
