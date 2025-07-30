import java.util.Scanner;

public class ResolucaoExercicio_Nota {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Digite a primeria nota:");
        double a1=scanner.nextDouble();
        System.out.print("Digite a segunda nota:");
        double a2=scanner.nextDouble();
        System.out.print("Digite a terceira nota:");
        double a3=scanner.nextDouble();
        System.out.print("Digite a quarta nota:");
        double a4=scanner.nextDouble();

        double mediaNotas=(a1+a2+a3+a4)/4;

        System.out.println("Media:"+mediaNotas+(mediaNotas>=7?"Aprovado!":"Reprovado."));

        scanner.close();

    }
}
