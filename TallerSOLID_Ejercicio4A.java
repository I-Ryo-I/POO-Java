interface ICombatable  { atacar(Personaje objetivo), recibirDano(int cantidad) }
interface IMovible     { moverACasilla(Casilla c) }
interface IPersistible { guardarEstado() }
interface IVisible     { mostrarEnMapa(), getNombre() }
