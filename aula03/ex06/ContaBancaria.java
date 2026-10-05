import java.util.Objects;

public class ContaBancaria {
    private int numero;

    public ContaBancaria(int numero) {
        this.numero = numero;
    }

    public int getNumero() { return numero; }

    @Override
    public String toString() {
        return "ContaBancaria[numero=" + numero + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ContaBancaria outra = (ContaBancaria) obj;
        return this.numero == outra.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1234);
        ContaBancaria c2 = new ContaBancaria(1234);
        System.out.println("c1.equals(c2): " + c1.equals(c2));
        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println(c1);
    }
}
