public class Main {
    public static void main(String[] args) {
        Triatleta t1 = new Triatleta("Lucas");
        Triatleta t2 = new Triatleta("Fernanda");

        Triatleta[] triatletas = { t1, t2 };

        for (Triatleta t : triatletas) {
            t.mostrarModalidades();
            t.nadar();
            t.pedalar();
            t.correr();
            System.out.println();
        }
    }
}
