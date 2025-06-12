public class Aviao {

    private int horasAtivo;

    public Aviao() {
        this.horasAtivo = 0;
    }

    public void fazVoo(int horas, Piloto piloto) {
        if (this.horasAtivo >= 200) {
            System.out.println("Nao pode voar, ir para revisao");
            return;
        }
        this.horasAtivo += horas;
        piloto.adicionaHoras(horas);
    }

    public void fazRevisao() {
        this.horasAtivo = 0;
    }

    public void imprime() {
        System.out.println("Quantidade de horas acumuladas: " + horasAtivo);
        System.out.println(horasAtivo >= 200 ? "Precisa revisar" : "Nao precisa revisar");
    }
}