/*Diferente de mim o professor usou o JOptionPane para
que aparece-se uma caixa de dialogo em vez de digitar direto no terminal.*/
import javax.swing.JOptionPane;

public class ExemploProfessor {
    public static void main(String[] args) {

        /*Aqui ele determina um float que é igual o char
        ele guarda apenas um caracter.*/
        float a;

        /*Aqui diz que o valor que for digitado na caixa de dialogo com a mensagem
         informe sua nota vai ser guardado como float na variavel a.*/
        a = Float.parseFloat(JOptionPane.showInputDialog("informe sua nota: "));
        //Se a for maior ou igual á 7.
        if (a >= 7) {

            //Ele vai aparecer uma mensagem dizendo resultado: aprovado.
            JOptionPane.showMessageDialog(null, "Resultado: Aprovado");

        //Senão se a for maior ou igual a 5 e menor ou igual a 7.
        } else if (a >= 5 && a <= 7) {

            //Vai aparecer uma mensagem escrita resultado:Recuperação
            JOptionPane.showMessageDialog(null, "Resultado: Recuperação");

        //Senão
        } else {

            //Vai aparecer resultado: reprovado.
            JOptionPane.showMessageDialog(null, "Resultado: Reprovado");

        }

    }

}
