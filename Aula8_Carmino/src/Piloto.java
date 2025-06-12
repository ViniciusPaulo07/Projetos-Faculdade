public class Piloto {

    private String nome;
    private int horasVoo;

    public Piloto(String nome) {
        this.nome = nome;
        this.horasVoo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaHoras(int horas) {
        this.horasVoo += horas;
    }

    public void imprime() {
        System.out.println("Nome do Piloto: " + nome);
        System.out.println("Quantidade de horas de voo: " + horasVoo);
        System.out.println("Tipo do Piloto: " + (horasVoo <= 200 ? "Co-Piloto" : "Comandante"));
    }
}
