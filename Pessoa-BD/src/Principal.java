import java.util.List;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        // Instanciamos o objeto DAO UMA VEZ
        PessoaDAO dao = new PessoaDAO();

        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int op;

        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
                op = -1; // Garante que o laço continue se a entrada for inválida
            }

            switch (op) {
                case 1: {
                    String nome = JOptionPane.showInputDialog("Nome?");
                    String fone = JOptionPane.showInputDialog("Fone?");
                    String email = JOptionPane.showInputDialog("Email?");
                    Pessoa novaPessoa = new Pessoa(nome, fone, email);
                    dao.inserir(novaPessoa); // Chama o método do DAO
                    break;
                }
                case 2: {
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código da pessoa a atualizar?"));
                    String nome = JOptionPane.showInputDialog("Novo nome?");
                    String fone = JOptionPane.showInputDialog("Novo fone?");
                    String email = JOptionPane.showInputDialog("Novo email?");
                    Pessoa pessoaAtualizada = new Pessoa(codigo, nome, fone, email);
                    dao.atualizar(pessoaAtualizada); // Chama o método do DAO
                    break;
                }
                case 3: {
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código da pessoa a apagar?"));
                    dao.apagar(codigo); // Chama o método do DAO
                    break;
                }
                case 4: {
                    List<Pessoa> pessoas = dao.listar(); // Chama o método do DAO
                    StringBuilder resultado = new StringBuilder("--- Lista de Pessoas ---\n\n");
                    for (Pessoa p : pessoas) {
                        resultado.append(p.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, resultado.toString());
                    break;
                }
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (op != 0);
    }
}