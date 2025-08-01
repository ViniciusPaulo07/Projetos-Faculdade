import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PessoaDAO {

    public void inserir(Pessoa pessoa) {
        String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";
        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getFone());
            ps.setString(3, pessoa.getEmail());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pessoa inserida com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir: " + e.getMessage());
        }
    }

    public void atualizar(Pessoa pessoa) {
        String sql = "UPDATE tb_pessoa SET nome = ?, fone = ?, email = ? WHERE codigo = ?";
        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getFone());
            ps.setString(3, pessoa.getEmail());
            ps.setInt(4, pessoa.getCodigo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pessoa atualizada com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
        }
    }

    public void apagar(int codigo) {
        String sql = "DELETE FROM tb_pessoa WHERE codigo = ?";
        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pessoa apagada com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao apagar: " + e.getMessage());
        }
    }

    public List<Pessoa> listar() {
        String sql = "SELECT * FROM tb_pessoa";
        List<Pessoa> pessoas = new ArrayList<>();
        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setCodigo(rs.getInt("codigo"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setFone(rs.getString("fone"));
                pessoa.setEmail(rs.getString("email"));
                pessoas.add(pessoa);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar: " + e.getMessage());
        }
        return pessoas;
    }
}
