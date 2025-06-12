public class Aviao {

    private int horasAtivo;

    //Detemina que as horas de voo estão zeradas.
    public Aviao() {
        this.horasAtivo = 0;
    }

    //fazVoo recebe horas e piloto como parametros.
    public void fazVoo(int horas, Piloto piloto) {

        //Se horasAtivo for maior ou igual á 200, mostra que não pode voar e ir para revisão.
        if (this.horasAtivo >= 200) {
            System.out.println("Nao pode voar, ir para revisao");
            return;
        }

        //Aqui ele soma e atribui mais horas á horasAtivo e adicona mais horas ao piloto.
        this.horasAtivo += horas;
        piloto.adicionaHoras(horas);
    }

    //Quando o avião faz a revisão as horaAtivo são zeradas.
    public void fazRevisao() {
        this.horasAtivo = 0;
    }

    //Aqui mostra os dados do avião.
    public void imprime() {
        System.out.println("Quantidade de horas acumuladas: " + horasAtivo);
        System.out.println(horasAtivo >= 200 ? "Precisa revisar" : "Nao precisa revisar");
    }
}