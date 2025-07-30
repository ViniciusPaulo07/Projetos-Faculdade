public class ExemploCris_Calculadora {
    public static void main(String[]args){
        int n1=10;
        int n2=10;
        int soma;
        int subtracao;
        int multi;
        int divisao;
        //soma
        soma=n1+n2;
        //subtracao
        subtracao=n1-n2;

        //multiplicao
        multi=n1*n2;
        //divisao
        divisao=n1/n2;

        System.out.println("|=====================================|");
        System.out.println("     Calculadora Cris S.A             |");
        System.out.println("|                 Menu                |");
        System.out.println("|                                     |");
        System.out.println("| 1 - Soma = " + soma                   );
        System.out.println("| 2 - Subtracaoo =" + subtracao          );
        System.out.println("| 3 - Multiplicao=" + multi           );
        System.out.println("| 4 - Divisao =" + divisao              );
        System.out.println("|=====================================|");
    }
}
