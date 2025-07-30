public class ContaBanco {
    int numeroConta;
    double saldo;
    double limite;
    double valorMais,valorMenos;

    void fazerDeposito(){
        System.out.println("Deposito no valor de " +valorMais +" Relizado: " + (saldo += valorMais));
    }
    void fazerSaque(){
        System.out.println("Saque no valor de " +valorMenos +" Relizado: " + (saldo -= valorMenos));
    }
    void imprimirExtrato(){
        System.out.println("Extrato: "+ numeroConta);
        System.out.println("Seu saldo e: " + saldo);
        System.out.println("limite disponivel: " + limite);
    }
    void consultarSaldo(){
        System.out.println("Saldo disponivel: "+ (saldo + limite));
    }
}