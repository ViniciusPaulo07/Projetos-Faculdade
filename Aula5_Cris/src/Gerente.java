public class Gerente extends Funcionario {
    String departamento, usuario, senha;

    void exibirDadosGerencia(){
        System.out.println("###### Dados ######");
        System.out.println("Departamento e = " + departamento);
        System.out.println("Usuario e = " + usuario);
        System.out.println("Senha e = " + senha);
    }
}
