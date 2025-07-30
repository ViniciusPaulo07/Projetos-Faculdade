import java.util.Scanner;

public class ExemploCris_Balada {
    public static void main(String[]args){
        String nome;
        int idade;

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome=ler.next();
        System.out.print("Digite sua idade: ");
        idade=ler.nextInt();

        if(idade<=18){
            System.out.print("Barrado! Menor de idade");
        }else {
            System.out.print("pode entrar,Maior de idade");
        }
    }
}
