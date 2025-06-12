public class Campeonato {

    private int jogosRealizados;

    //Contrutor de Campeonato ele pega jogosRealizados já determina que o valor dele é 0.
    public Campeonato() {
        this.jogosRealizados = 0;
    }

    public void realizarJogo(TimeFutebol timeCasa, TimeFutebol timeVisitante) {

        timeCasa.estiloDeJogo();
        timeVisitante.estiloDeJogo();

        // Aplica as regras
        if (timeCasa.estiloDeJogo() == 0 && timeVisitante.estiloDeJogo() != 0) {
            // Time da casa vence
            timeCasa.venceu();
            timeVisitante.perdeu();
            jogosRealizados++;
        } else if (timeVisitante.estiloDeJogo() != 0 && timeCasa.estiloDeJogo() == 0) {
            // Time visitante vence
            timeVisitante.venceu();
            timeCasa.perdeu();
            jogosRealizados++;
        } else {
            // Empate
            timeCasa.empatou();
            timeVisitante.empatou();
            jogosRealizados++;
        }
    }

    //Aqui modifica e mostra os dados dos jogos realizados.
    public void imprime() {
        System.out.println("Jogos realizados: " + jogosRealizados);
    }
}
