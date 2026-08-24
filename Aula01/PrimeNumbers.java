import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero inicial do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o numero final do intervalo: ");
        int fim = scanner.nextInt();

        System.out.println("Numeros primos entre " + inicio + " e " + fim + ":");

        // Laco para percorrer todos os numeros dentro do intervalo
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println(); // Quebra de linha no final
        scanner.close();
    }

    // Metodo auxiliar
    public static boolean ehPrimo(int numero) {
        // Numeros menores ou iguais a 1 nao sao primos
        if (numero <= 1) {
            return false;
        }

        // Testa divisores de 2 ate a metade do numero
        for (int j = 2; j <= numero / 2; j++) {
            if (numero % j == 0) {
                return false; // Achou um divisor, nao eh primo
            }
        }
        
        return true; // caso laco terminar sem achar divisores, eh primo
    }
}