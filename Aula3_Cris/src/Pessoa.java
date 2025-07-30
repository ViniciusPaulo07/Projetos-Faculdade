public class Pessoa {
    String nome;
    int idade;
    double peso;
    boolean estaAcordado;

    void dizerBomDia() {
        System.out.println("Oiee Bom Dia");
    }

    void andar() {
        System.out.println("Va ate a cantina comprar um bombom para Pro");
    }

    void dormir() {
        System.out.println("Vai deitar");
    }

    void exibirDadosPessoa() {
        System.out.println("Seu nome e: " + nome);
        System.out.println("Sua idade e: " + idade);
        System.out.println("Seu peso e: " + peso);
    }

    void verificarEstaAcordado() {
        if (estaAcordado == true) {
            System.out.println("Esta Acordado");
        } else {
            System.out.println("Esta dormindo");
        }
    }
}