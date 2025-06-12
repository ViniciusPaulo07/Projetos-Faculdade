public class TimeFutebol {

    //Aqui eu determino as variaveis que ainda não tenho os valores.
    private String nome;
    private int jogos;
    private int pontos;
    private int estiloDeJogo;

    //Contrutor Vazio.
    public TimeFutebol() {
    }

    //Construtor que tem como paremetro nome e estiloDeJogo.
    public TimeFutebol(String nome, int estiloDeJogo) {

        /*O nome recebe um nome, o estiloDeJogo rebece um estiloDeJogo,
        e jogos e pontos recebem 0. */
        this.nome = nome;
        this.estiloDeJogo = estiloDeJogo;
        this.jogos = 0;
        this.pontos = 0;
    }

    //Aqui é um getter, ele pega o estiloDeJogo
    public int estiloDeJogo() {
        return estiloDeJogo;
    }

    //Aqui é um setter, como ele foi pego pelo get aqui ele é modificado.
    public void estiloDeJogo(int estiloDeJogo) {

        //Se o estiloDeJogo for igual a 0.
        if (this.estiloDeJogo == 0) {

            //Mostra que ele é Retranqueiro.
            System.out.println("Retranqueiro");

            //Senão ele Joga no ataque.
        } else {
            System.out.println("Joga no ataque");
        }
    }

    //Aqui é um set que caso ele vença ele soma e atribui os valores determinados.
    public void venceu() {

        //Ele está somando e atribuindo 3 ponto e 1 jogo.
        this.pontos += 3;
        this.jogos += 1;
    }

    //Aqui igual o set acima ele atribui e soma os valores determinados.
    public void empatou() {

        //Ele está e somando e atribuindo 1 ponto e 1 jogo.
        this.pontos += 1;
        this.jogos += 1;
    }

    //Aqui se repete, atribuindo e somando os valores determinados.
    public void perdeu() {

        //Por fim ele soma e atibui 0 pontos e 1 jogo.
        this.pontos += 0;
        this.jogos += 1;
    }

    //O ultimo set ele imprime os dados pegos(get).
    public void imprime() {
        //Como o nome, pontos, jogos e estilo de jogo.
        System.out.println("Nome: " + nome);
        System.out.println("Pontos: " + pontos);
        System.out.println("Jogos: " + jogos);
        System.out.println("Estilo de Jogo: " + estiloDeJogo);
    }
}
