import java.util.Scanner;

/*Nessa aula o exercicio era calcular o IMC de uma pessoa
recebendo o peso e altura pelo usuario, e ao final mostrar
se ele está acima ou abaixo do peso.*/
public class Aula3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Determinando três variáveis double.
        double peso, altura, imc;

        //Diferente dos outros códigos até agora esse pergunta ao usuario.
        System.out.print("Quantos voce pesa: ");
        peso = ler.nextDouble();

        System.out.print("Qual sua altura: ");
        altura = ler.nextDouble();

        //O calculo tem ser feito depois de o usuario colocar o peso e altura.
        imc = peso /(altura*altura);

        //Ao final depenendo o resultado do imc ele ira mostra em qual estado você está.
        if (imc < 18.5){
            System.out.println("Voce esta abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Voce esta com peso normal");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Voce esta com sobrepeso");
        } else{
            System.out.println("Voce esta com obesidade");
        }
        ler.close();
    }
}