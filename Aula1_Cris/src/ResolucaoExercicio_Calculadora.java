import java.util.Scanner;

public class ResolucaoExercicio_Calculadora {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero:");
        double num2 = scanner.nextDouble();

        System.out.println("Soma:" +(num1+num2));
        System.out.println("Subtracao:" +(num1-num2));
        System.out.println("Multiplicacao:" +(num1*num2));
        System.out.println("Divisao:" +(num1/num2));

        if(num2!=0){
            System.out.println("Divisao:" +(num1/num2));
        }else{
            System.out.println("Nao é possivel dividir por zero");

        }
        scanner.close();
    }
}
