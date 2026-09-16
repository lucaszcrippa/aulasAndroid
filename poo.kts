
open class Animal(var nome: String) {

    open fun emitirSom() {
        println("O animal emite um som.")
    }
}

class Cachorro(nome: String) : Animal(nome) {

    override fun emitirSom() {
        println("$nome faz: Au au!")
    }
}

class Gato(nome: String) : Animal(nome) {

    override fun emitirSom() {
        println("$nome faz: Miau!")
    }
}

fun main() {

    val cachorro = Cachorro("Rex")
    val gato = Gato("Mingau")

    cachorro.emitirSom()
    gato.emitirSom()
}
