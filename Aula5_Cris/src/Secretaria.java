public class Secretaria extends Funcionario {
    int ramal, numeroProtocolo;
    boolean horarioDisponivel;

    void exibirDadosSecretaria(){
        System.out.println("###### Dados ######");
        System.out.println("Ramal e = " + ramal);
        System.out.println("Numero do Protocolo e = " + numeroProtocolo);
        System.out.println("Tem Horario Disponivel = " + (horarioDisponivel ? "Tem sim" : "Não Tem"));
    }
}
