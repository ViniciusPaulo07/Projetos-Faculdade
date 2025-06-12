public class Piloto {

    private String nome;
    private int horasVoo;

    //Construtor Piloto que tem como parametro nome.
    public Piloto(String nome) {
        //Ele tem um nome e tem 0 horasVoo.
        this.nome = nome;
        this.horasVoo = 0;
    }

    //Ele pega o nome.
    public String getNome() {
        //E retorna o nome.
        return nome;
    }

    //Ele recebe o nome como parametro e modifica atribuindo a variavel nome um nome.
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Esse metodo recebe horas como parametros.
    public void adicionaHoras(int horas) {
        //Ele soma e atribui horas as horasVoo.
        this.horasVoo += horas;
    }

    //Já esse metodo e pega os dados e mostra.
    public void imprime() {
        System.out.println("Nome do Piloto: " + nome);
        System.out.println("Quantidade de horas de voo: " + horasVoo);
        System.out.println("Tipo do Piloto: " + (horasVoo <= 200 ? "Co-Piloto" : "Comandante"));
    }
}
