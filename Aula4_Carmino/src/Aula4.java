import java.util.Scanner;

public class Aula4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano;


        System.out.print("Digite o ano para verificacao: ");
        ano = ler.nextInt();

        /*Se o resto da divisão de ano/4 for igual 0 e o resto da divisão de ano/100
        for diferente de 0 ou o resto da divisão de ano/400 for igual 0.*/
        if ((ano % 4 == 0 && ano % 100 != 0)|| ano % 400 == 0){

            //Mostra que é ano bissexto.
            System.out.println("Esse ano e bissexto");
            //Senão é um ano normal.
        }else {
            System.out.println("Esse ano e normal");
        }
        //Aqui eu tentei fazer essa estrutura de decisão em uma unica linha usando operadores ternários.
        System.out.println(((ano % 4 == 0 && ano % 100 != 0)|| ano % 400 == 0)? "Ano bissexto" : "Ano normal");
    }

}