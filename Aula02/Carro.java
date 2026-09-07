package Aula02;

// Classe principal
public class Carro {
    // Atributos
    String marca;
    String modelo;
    int ano;
    
    // Metodos sem parametros
    void exibirInfo(){
        System.out.println("Seu Carro: " + marca + ", " + modelo + ", " + ano);
    }

    // Main
    public static void main(String[] args) {
        //Primeira instancia
        Carro carro1 = new Carro();
        carro1.marca = "Volkswagen";
        carro1.modelo = "Voyage";
        carro1.ano = 2010;
        carro1.exibirInfo();
        
        //Segunda instancia
        Carro carro2 = new Carro();
        carro2.marca = "Chevrolet";
        carro2.modelo = "Onix";
        carro2.ano = 2022;
        carro2.exibirInfo();
    }
}
