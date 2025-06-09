//Importa a classe Scanner, que serve para ler o que o usuário digita.

import java.util.Scanner;

//Cria uma classe chamada Aula1
public class Aula1 {
    //Esse é o ponto de entrada.
    //O Java sempre começa executando o main. Sem isso , nada roda.
    public static void main(String[] args) {
        //Cria uma váriavel chamada numero que vai guardar um valor inteiro
        int numero;
        /*Cria um objeto chamado entrada que usa Scanner para ler o
         que o usuário digitar*/
        Scanner entrada = new Scanner(System.in);
        //Aqui o programa espera o usuário digitar, para guardalo na variável numero
        numero = entrada.nextInt();
        //Se o numero digitado for igual a zero
        if (numero == 0) {
            //Mostra isso
            System.out.println("O numero e Zero");
            //Senão se o numero for maior ou igual a 1
        } else if (numero >= 1) {
            //Mostra isso
            System.out.println("O numero e Positivo");
            //Senão mostra isso
        } else {
            System.out.println("O numero e Negativo");
        }
    }
}