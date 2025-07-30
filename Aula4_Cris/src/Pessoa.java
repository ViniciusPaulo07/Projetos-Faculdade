public class Pessoa {
    String nome;
    int idade;
    char sexo;
    String faixa;

    void imprimir(){
        System.out.println("Seu Nome e: "+nome);
        System.out.println("Sua idade e: "+idade);
        System.out.println("Seu sexo e: "+sexo);
        System.out.println("Sua faixa e: "+faixa);
    }
    void classificar(){
        if(idade < 0){
            System.out.println("Erro");
        }else if (idade <= 2){
            System.out.println(faixa ="Bebe");
        }else if (idade <= 11){
            System.out.println(faixa ="Crianca");
        }else if (idade <= 19){
            System.out.println(faixa ="Adolecente");
        }else if (idade <= 30){
            System.out.println(faixa ="Jovem");
        }else if (idade <= 60){
            System.out.println(faixa ="Adulto");
        }else{
            System.out.println("idoso");
        }
    }
}