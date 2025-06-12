import java.util.Scanner;

public class ExemploProfessor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a;

        double b;

        double c;

        //Aqui o professor colocou para que apareça uma mensagem.
        System.out.print("digite um valor: ");

        //Depois que for digitado ele vai guardar o valor digitado no a como Double.
        a = entrada.nextDouble();

        System.out.print("digite outro valor: ");

        b = entrada.nextDouble();

        System.out.print("digite mais um valor: ");

        c = entrada.nextDouble();

        //Depois fazendo a estrutura de decisão para determinar qual o maior numero.
        if (a > b && a > c) {

            System.out.println(a + " e o maior valor entre os valores postos");

        } else if (b > a && b > c) {

            System.out.println(b + " e o maior valor entres os valores postos");

        } else if (c > a && c > b) {

            System.out.println(c + " e o maior valor posto entre os valores postos");

        }

    }

}
