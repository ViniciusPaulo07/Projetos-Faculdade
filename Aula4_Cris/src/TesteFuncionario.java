public class TesteFuncionario {
    public static void main(String[] args) {
    Funcionario f1 = new Funcionario();

    f1.nomeFunc = "Vinicius";
    f1.idFunc = 825162323;
    f1.departamento = "Gracon";
    f1.dataContratacao = "11/01/2024";
    f1.salario = 2500.0;
    f1.documento = "423.857.228-95";
    f1.situacao = true;

    f1.exibirFuncionario();
    f1.atualizarFuncionario();
    f1.verificarFuncionario();
    }
}
