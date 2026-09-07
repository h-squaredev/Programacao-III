package Aula02_Complementar;


public class FormatadorTexto {
        public static void main(String[] args) {
                // Atribuicao da farase inicial 
                String fraseInicial = " Programação Orientada a Objetos com Java ";

                // Capar comeco e fim vazios de uma string
                String fraseCapada = fraseInicial.trim();
                System.out.println("Frase capada: '" + fraseCapada.trim() + "'");

                // Imprecao da quantidade total de caracteres da frase capada
                System.out.println("Quantidade de caracteres: " + fraseCapada.length());
                
                // Imprecao da frase toda em maiuscula
                System.out.println("Frase completamente em maiúsculas: '" + fraseCapada.toUpperCase() + "'");
                
                // Substituicao da palavra 'Java' por 'Linguagem Java'
                System.out.println("Frase substituída: '" + fraseCapada.replace("Java", "Linguagem Java") + "'");
                
                // Exibicao do 5o caracter 
                System.out.println("O caracter de índice 5 na frase é o: '" + fraseCapada.charAt(5) + "'");
        }
        

}
