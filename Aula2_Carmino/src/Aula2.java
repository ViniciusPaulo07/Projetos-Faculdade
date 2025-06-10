import java.util.Scanner;
/*O principio desse código é o mesmo do outro
mudando pouca coisa.*/
public class Aula2 {

    public static void main(String[] args) {
        //Aqui declaro variável para guardar o valor da compra.
        double valorCompra;
        Scanner ler = new Scanner(System.in);
        //Aqui espera receber ele lê o valor digitado pelo usuario.
        valorCompra = ler.nextDouble();
        //Se o valorCompra for maior ou igual a 200 ele ganha desconto.
        if (valorCompra >= 200) {
            //O desconto calculado e mostrado. O desconto nesse caso é 10% do valor da compra.
            System.out.println("Valor com Desconto:" + (valorCompra - valorCompra * 10 / 100));
            //Senão mostra apenas o valor da compra.
        } else {
            System.out.println("Valor da Compra:" + valorCompra);
        }
        //E ao final fechando o Scanner.
        ler.close();
    }
}