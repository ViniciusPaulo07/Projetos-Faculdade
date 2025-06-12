public class Campeonato {

    private int jogosRealizados;

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

    public void imprime() {
        System.out.println("Jogos realizados: " + jogosRealizados);
    }
}
