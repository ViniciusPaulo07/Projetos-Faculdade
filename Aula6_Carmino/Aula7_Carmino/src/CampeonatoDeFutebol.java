public class CampeonatoDeFutebol {

    /*Já aqui ele instancia os objetos TimeFutebol, estiloDeJogo e
    o Campeonato, e realizando os jogos para no final mostrar os dados
    de cada time instanciado.*/
    public static void main(String[] args) {
        TimeFutebol time1, time2, time3;
        Campeonato camp1;
        time1 = new TimeFutebol("Bimboca", 0);
        time2 = new TimeFutebol("BocaSeniors", 0);
        time3 = new TimeFutebol("TerceiroTDS", 1);
        camp1 = new Campeonato();
        camp1.realizarJogo(time1, time2);
        camp1.realizarJogo(time2, time3);
        camp1.realizarJogo(time3, time1);
        camp1.realizarJogo(time3, time2);
        camp1.imprime();
        time1.imprime();
        time2.imprime();
        time3.imprime();
    }

}