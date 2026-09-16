
class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }

    void emitirSom() {
        System.out.println("O animal emite um som.");
    }
}

class Cachorro extends Animal {

    Cachorro(String nome) {
        super(nome);
    }


    @Override
    void emitirSom() {
        System.out.println(nome + " faz: Au au!");
    }
}

class Gato extends Animal {

    Gato(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println(nome + " faz: Miau!");
    }
}

class Scratch {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Mingau");

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
