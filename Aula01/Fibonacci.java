public class Fibonacci {
    public static void main(String[] args) {
        //implementacao de vetor com tamanho 30
        int elementos[] = new int [30];
        elementos[0] = 1;
        elementos[1] = 1;

        // laco para preencher do 3o elemento em diante
        for (int i = 2; i < elementos.length; i++){
                elementos[i] = elementos[i - 1] + elementos[i - 2]; 
        }
        // Imprime os resultados no terminal
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i] + " ");
        }
    }   
}
