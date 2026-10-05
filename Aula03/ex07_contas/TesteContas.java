public class TesteContas {
    public static void main(String[] args) {
        Conta c = new Conta(1, 500);
        ContaEspecial ce = new ContaEspecial(2, 200, 300);
        ContaPoupanca cp = new ContaPoupanca(3, 1000, 0.005);

        c.depositar(100);
        System.out.println("Saque 800 na Conta: " + c.sacar(800));
        System.out.println("Saque 450 na ContaEspecial: " + ce.sacar(450));
        cp.renderJuros();

        System.out.println(c);
        System.out.println(ce);
        System.out.println(cp);
    }
}
