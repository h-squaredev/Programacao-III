public class TrueOrFalse {
    public static void main(String[] args) {
        // As variaveis agora sao locais e as armazenei em um vetor
        boolean[] listaBooleana = {true, false, true};

        // Implementacao de laco para nao repetir if
        for (int i = 0; i < listaBooleana.length; i++){
            if (listaBooleana[i]) {
                System.out.println("A variavel " + (i + 1) + " eh verdadeira!");
            }else{
                System.out.println("A variavel " + (i + 1) + " eh falsa!");
            }
        } 
    }
}
