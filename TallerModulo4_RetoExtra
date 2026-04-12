//En Java
public double promedioNivel() {
    int suma = 0, cantidad = 0;
    for (Personaje p : equipoPrincipal) {
        if (p != null) {
            suma += p.getNivel();
            cantidad++;
        }
    }
    return cantidad > 0 ? (double) suma / cantidad : 0;
}

public void imprimirDungeon() {
    System.out.println("\n=== DUNGEON ===");
    for (Personaje[] fila : dungeon) {
        for (Personaje celda : fila) {
            if (celda != null) {
                System.out.printf("[%-12s]", celda.getNombre());
            } else {
                System.out.printf("[%-12s]", " vacío ");
            }
        }
        System.out.println();
    }
}
