package Aula02;

import java.util.ArrayList;
import java.util.Iterator;
    
public class NomesAlunos {
    public static void main(String[] args){
        //Intanciamento da Lista
        ArrayList<String> listaNomes = new ArrayList<String>();
        
        // add pelo menos 5 nomes
        listaNomes.add("Humberto");
        listaNomes.add("Joao");
        listaNomes.add("Carlos");
        listaNomes.add("Arthur");
        listaNomes.add( "Paulo\n");

        // Iterator i
        Iterator<String> i = listaNomes.iterator();
        
        while(i.hasNext()){
            String nome = i.next();
            System.out.println(nome);
            
        }
        
        // remove 1 nome
        listaNomes.remove(0);

        // Iterator j
        Iterator<String> j = listaNomes.iterator();

         while(j.hasNext()){
            String nome = j.next();
            System.out.println(nome);
            
        }
    }
}
