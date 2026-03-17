interface Volador {
    void volar();
    void aterrizar();
    // Java 8+: método con implementación por defecto
    default void repostar() {
        System.out.println("Repostando...");
    }
}
interface Nadador {
    void nadar();
}
// Implementa dos interfaces — herencia múltiple de contratos
class Pato implements Volador, Nadador {
    public void volar()     { System.out.println("Volar"); }
    public void aterrizar() { System.out.println("Plof"); }
    public void nadar()      { System.out.println("Nadar"); }
}
