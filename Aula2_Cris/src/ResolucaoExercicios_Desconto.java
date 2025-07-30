public class ResolucaoExercicios_Desconto{
    public static void main(String[] args) {

        int P= 10000;

        if(P>10000){
            System.out.println("Desconto de 40%: " + (P - P * 40/100));
        } else if (P>=5000){
            System.out.println("Desconto de 20%: " + (P - P * 20/100));
        } else if (P>=2500){
            System.out.println("Desconto de 10%: " + (P - P * 10/100));
        } else{
            System.out.println("Desconto de 5%: " + (P - P * 5/100));
        }
    }
}
