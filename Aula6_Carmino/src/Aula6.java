import java.util.Scanner;

public class Aula6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1, num2, num3;

        //Aqui estou pedindo para que usuario digit 3 numeros inteiros.
        System.out.print("Digite o primeiro numero: ");
        num1 = ler.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = ler.nextInt();
        System.out.print("Digite o terceiro numero: ");
        num3 = ler.nextInt();

        //Se num1 for maior que num2 e maior que num3.
        if (num1 > num2 && num1 > num3) {

            //Mostra num1 sendo o maior.
            System.out.println("O maior numero e: " + num1);

            //Senão se num2 for maior que num3.
        } else if (num2 > num3) {

            //Mostra num2 sendo o maior.
            System.out.println("O maior numero e: " + num2);

            //Senão.
        } else {

            //num3 é o maior.
            System.out.println("O maior numero e: " + num3);
        }


        //Usando operador tenário na mesma linha.
        System.out.println((num1 > num2 && num1 > num3)
                ? "O maior numero e: " + num1
                : (num2 > num3 ? "O maior numero e: " + num2
                : "O maior numero e: " + num3));

        ler.close();
    }
}