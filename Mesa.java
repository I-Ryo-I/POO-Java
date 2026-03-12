public class Mesa{
    public String color;
    public String material;

    public Mesa(String color, String material){
        this.color = color;
        this.material = material;
    }

    public void sostener(String objeto){
        System.out.println("Este objeto "+objeto+" Esta encima de la mesa");
    }

    public void apoyar(String tareas){
        System.out.println("Estoy haciendo " +tareas+ " En la mesa");
    }

    public static void main(String[] args){
        Mesa m = new Mesa("Amarilla", "Plastico");
        m.sostener("Computador");
        m.apoyar("El taller de python");
    }

}