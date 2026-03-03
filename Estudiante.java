import java.util.ArrayList;

public class Estudiante{
    private String nombre;
    private int edad;
    private String carrera;
    private ArrayList<String> materias;
    
    public Estudiante (String nombre, int edad, String carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.materias = new ArrayList<>();
    }
    //Metodo para inscribir materia
    public void inscribirMateria (String materia){
            this.materias.add(materia);
            System.out.println(nombre +" se inscribio en "+materia);
    }
    //Metodo para presentarse
    public void presentarse(){
        System.out.println("Hola soy " + nombre);
        System.out.println("Tengo " + edad + "años");
        System.out.println("Estudio " + carrera);
        System.out.println("Materias inscritas: " + materias.size());
    }
    //Metodo Estudiar
    public void estudiar(int horas){
        System.out.println(nombre + " estudió " + horas + " horas");
    }
    //Metodo Main para probar
    public static void main(String[] args){
        //Crear objetos
        Estudiante est1 = new Estudiante("Ana García", 20, "Ing. Sistemas");
        Estudiante est2 = new Estudiante("Carlos López", 22, "Ing. Sistemas");
        Estudiante est3 = new Estudiante("Juan Moreno", 17, "Sist. Datos");
        //Usar metodos
        est1.presentarse();
        System.out.println("---");
        est1.inscribirMateria("POO");
        est1.inscribirMateria("Bases de Datos");
        System.out.println("---");
        est2.presentarse();
        est2.inscribirMateria("POO");
        System.out.println("---");
        est3.presentarse();
        est3.inscribirMateria("Estructura de datos");
        est3.inscribirMateria("POO");
        est3.inscribirMateria("Ingles");
        est3.estudiar(2);
    }
}