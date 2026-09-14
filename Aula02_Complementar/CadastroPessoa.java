package Aula02_Complementar;

import java.util.ArrayList;
import java.util.Iterator;

public class CadastroPessoa {

    // Método estático para validar o nome
    static boolean validarNome(String nome) {
        // Retorna falso imediatamente se for nulo para evitar NullPointerException
        if (nome == null) {
            return false;
        }
        
        // Remove os espaços em branco no início e no fim
        String nomeLimpo = nome.trim();
        
        // Verifica se tem pelo menos 3 caracteres (o que já garante que não é vazio)
        if (nomeLimpo.length() >= 3) {
            return true;
        }
        
        return false;
    }

    // Método de busca que recebe a lista e o termo
    static void buscarUsuario(ArrayList<String> lista, String nomeBusca) {
        Iterator<String> iterator = lista.iterator();
        boolean encontrado = false;
        
        while (iterator.hasNext()) {
            String nomeAtual = iterator.next();
            
            // Ignora maiúsculas e minúsculas na comparação
            if (nomeAtual.equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break; // Interrompe a busca assim que achar
            }
        }
        
        if (encontrado) {
            System.out.println("Usuário '" + nomeBusca + "' encontrado no sistema!");
        } else {
            System.out.println("Usuário '" + nomeBusca + "' NÃO está cadastrado.");
        }
    }

    public static void main(String[] args) {
        // Cria a lista para cadastrar nomes
        ArrayList<String> listaNomes = new ArrayList<>();

        // Variáveis com os 4 nomes para adicionar
        String n1 = "Humberto";
        String n2 = "Rayssa";
        String n3 = "Elisângela";
        String n4 = "Samuel";

        // Adiciona à lista apenas se passar na validação
        if (validarNome(n1)) listaNomes.add(n1);
        if (validarNome(n2)) listaNomes.add(n2);
        if (validarNome(n3)) listaNomes.add(n3);
        if (validarNome(n4)) listaNomes.add(n4);

        System.out.println("=== Teste de Busca no Cadastro ===");
        
        // Testando a busca (usando variações de maiúsculas e minúsculas)
        buscarUsuario(listaNomes, "rAySsA");
        buscarUsuario(listaNomes, "humberto");
        buscarUsuario(listaNomes, "Bruno");
    }
}
