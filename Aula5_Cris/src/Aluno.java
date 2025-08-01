public class Aluno extends Pessoa {
        int numeroMatricula, nota1, nota2, resultado;
        String curso, disciplina;

        void exibirAluno(){
            System.out.println("Matricula: " + numeroMatricula);
            System.out.println("Voce Estuda " + curso );
            System.out.println("Sua Diciplina e = " + disciplina);
        }
        void calcularMedia(){
            resultado = (nota1 + nota2) / 2;
            System.out.println("Voce foi " + (resultado>= 7 ? "Aprovado" : "Reprovado"));
        }
}
