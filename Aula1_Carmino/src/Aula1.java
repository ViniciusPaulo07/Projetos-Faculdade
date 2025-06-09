import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        if (numero == 0) {
            System.out.println("O numero e Zero");
        } else if (numero >= 1) {
            System.out.println("O numero e Positivo");
        } else {
            System.out.println("O numero e Negativo");
        }
    }
}