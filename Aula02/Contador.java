package Aula02;

public class Contador {
    // Atributo estatico (significa que eh compartilhado por todos os objetos)
    static int totalObjetos = 0;

    // Construtor
    public Contador() {
        totalObjetos++; 
    }

    //Metodo estatico
    static void mostrarTotal(){
        System.out.println("Total de objetos criados" + totalObjetos);
    }

    //Main com alguns objetos
    public static void main(String[] args) {
        //instanciamentos
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();

        Contador.mostrarTotal();;
    }
}
