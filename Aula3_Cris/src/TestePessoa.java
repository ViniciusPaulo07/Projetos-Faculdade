public class TestePessoa {
    public static void main(String[] args) {
        Pessoa P1 = new Pessoa();

        P1.nome = "Vinicius";
        P1.idade = 21;
        P1.peso = 80;
        P1.estaAcordado = true;

        P1.dizerBomDia();
        P1.andar();
        P1.dormir();
        P1.exibirDadosPessoa();
        P1.verificarEstaAcordado();
    }
}
