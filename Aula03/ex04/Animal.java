public class Animal {
    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }

    public static void main(String[] args) {
        Animal[] animais = { new Cachorro(), new Gato() };
        for (Animal a : animais) {
            a.emitirSom();
        }
    }
}
