public class CuentaBancaria {
    public    String  titular;  // público
    protected String  tipo;     // protegido
    private   double saldo;    // privado

    public CuentaBancaria(String t, double s) {
        titular = t; tipo = "ahorros"; saldo = s;
    }

    public double getSaldo() { return saldo; }

    public void setSaldo(double v) {
        if (v >= 0) saldo = v;
        else throw new IllegalArgumentException();
    }
}