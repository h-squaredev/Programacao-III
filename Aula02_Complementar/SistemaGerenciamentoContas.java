package Aula02_Complementar;

import java.util.ArrayList;
import java.util.Iterator;

class ContaBancaria {
    int numero;
    String titular;
    double saldo;
}

public class SistemaGerenciamentoContas {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        ContaBancaria conta1 = new ContaBancaria();
        conta1.numero = 1010;
        conta1.titular = "Ana Silva";
        conta1.saldo = 2500.50;
        listaContas.add(conta1);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.numero = 2020;
        conta2.titular = "Bruno Costa";
        conta2.saldo = 1340.75;
        listaContas.add(conta2);

        ContaBancaria conta3 = new ContaBancaria();
        conta3.numero = 3030;
        conta3.titular = "Carlos Mendes";
        conta3.saldo = 8900.00;
        listaContas.add(conta3);

        double saldoTotalAcumulado = 0.0;

        Iterator<ContaBancaria> iterator = listaContas.iterator();
        
        System.out.println("=== Relatório de Contas ===");
        
        while (iterator.hasNext()) {
            ContaBancaria contaAtual = iterator.next();
            
            System.out.println("Número: " + contaAtual.numero + " | Titular: " + contaAtual.titular);
            
            saldoTotalAcumulado += contaAtual.saldo;
        }

        System.out.println("===========================");
        System.out.printf("Saldo total acumulado no banco: R$ %.2f\n", saldoTotalAcumulado);
    }
}