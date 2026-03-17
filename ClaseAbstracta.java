abstract class Figura {
    protected String color;   // estado compartido

    public Figura(String color) {
        this.color = color;
    }

    public abstract double area();       // abstracto
    public abstract double perimetro();  // abstracto

    public String describir() {          // concreto
        return "["+color+"] A="+area()+" P="+perimetro();
    }
}
class Circulo extends Figura {
    double r;
    public Circulo(double r, String c) { super(c); this.r=r; }
    public double area()      { return Math.PI * r * r; }
    public double perimetro(){ return 2 * Math.PI * r; }
}