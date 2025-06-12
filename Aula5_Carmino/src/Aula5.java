import java.util.Scanner;

public class Aula5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nota;

        System.out.print("Digite sua nota: ");
        nota = ler.nextInt();

        //Se o valor de nota for menor que 5.
        if (nota < 5) {

            //Mostra Reprovado.
            System.out.println("Reprovado");

            //Se o valor de noa for maior que 5 e menor que 6.9.
        } else if (nota > 5 && nota < 6.9) {

            //Mostra Recuperação
            System.out.println("Recuperacao");
            //Se não mostra Aprovado.
        } else {
            System.out.println("Aprovado");
        }

        //Aqui eu fiz a usando operadores ternários.
        System.out.println(
                nota < 5 ? "Reprovado" :
                        (nota > 5 && nota < 6.9 ? "Recuperacao" : "Aprovado"));
    }
}