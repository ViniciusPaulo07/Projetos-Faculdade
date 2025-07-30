import javax.swing.*;

public class ExemploCris_Tabuada {
    public static void main(String[]args){
        String a,b;
        float x,y,res;
        a= JOptionPane.showInputDialog("DIgite o primeiro numero");
        x= Float.parseFloat(a);
        b= JOptionPane.showInputDialog("Digite o segundo numero");
        y= Float.parseFloat(b);
        res=(x+y);
        System.out.print(res);
        JOptionPane.showMessageDialog(null, "Resultado da soma:" + res);
        res=(x-y);
        JOptionPane.showMessageDialog(null, "Resultado da subtracacao:" + res);
        res=(x*y);
        JOptionPane.showMessageDialog(null, "Resultado da multiplicacao:" + res);
        res=(x/y);
        JOptionPane.showMessageDialog(null, "Resultado da divisao:" + res);

    }
}
