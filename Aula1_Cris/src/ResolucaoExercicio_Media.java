import java.util.Scanner;

public class ResolucaoExercicio_Media {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Digite quantos km foram percorridos:");
        double distancia=scanner.nextDouble();
        System.out.print("Digite quantos litros de combustivel foram gasto:");
        double combustivel=scanner.nextDouble();

        double consumoMedio=distancia/combustivel;

        System.out.println("O consumo medio do automovel e:"+consumoMedio+"Km/litros");

        scanner.close();
    }
}
