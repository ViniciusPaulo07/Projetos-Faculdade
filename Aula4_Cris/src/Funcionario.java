public class Funcionario {
    int idFunc;
    String nomeFunc;
    String departamento;
    String dataContratacao;
    double salario;
    String documento;
    boolean situacao;

    void exibirFuncionario(){
        System.out.println("Seu nome e: "+nomeFunc);
        System.out.println("Seu id e: "+idFunc);
        System.out.println("Seu departamento e: "+departamento);
        System.out.println("Voce foi contratado: "+dataContratacao);
        System.out.println("Seu salario e: "+salario);
        System.out.println("Seu documeto e: "+documento);
        System.out.println("Situacao: " + (situacao ? "Ativo" : "Inativo"));
    }
    void atualizarFuncionario(){
        System.out.println(salario + (salario*20/100));
    }
    void verificarFuncionario(){
        if (situacao){
            System.out.println("Voce esta Ativo");
        }else {
            System.out.println("Voce esta Inativo");
        }
    }
}
