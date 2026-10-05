public class Calculadora {
    public int somar(int a, int b) { return a + b; }
    public double somar(double a, double b) { return a + b; }
    public int somar(int a, int b, int c) { return a + b + c; }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println("somar(2, 3) = " + c.somar(2, 3));
        System.out.println("somar(2.5, 3.5) = " + c.somar(2.5, 3.5));
        System.out.println("somar(1, 2, 3) = " + c.somar(1, 2, 3));
    }
}
