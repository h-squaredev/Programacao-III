import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double var1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double var2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = var1 + var2;
                break;
            case '-':
                resultado = var1 - var2;
                break;
            case '*':
                resultado = var1 * var2;
                break;
            case '/':
                if (var2 != 0) {
                    resultado = var1 / var2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("O resultado de " + var1 + " " + operacao + " " + var2 + " eh: " + resultado);
        }

        scanner.close();
    }
}