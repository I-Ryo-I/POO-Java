// Java
public static int contarPersonajes(Personaje[][] tablero) {
    int contador = 0;
    for (int f = 0; f < tablero.length; f++) {           
        for (int c = 0; c < tablero[f].length; c++) {   
            if (tablero[f][c] != null) {                 
                contador++;                              
            }
        }
    }
    return contador;                                     
}
