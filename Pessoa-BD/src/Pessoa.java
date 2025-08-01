import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Pessoa {

    private int codigo;
    private String nome;
    private String fone;
    private String email;

    public Pessoa(){}

    public Pessoa(int codigo,String nome,String fone,String email){
        this.codigo=codigo;
        this.nome=nome;
        this.fone=fone;
        this.email=email;
    }

    public int codigo(){
        return codigo;
    }
    public String nome(){
        return nome;
    }
    public String fone(){
        return fone;
    }
    public String email(){
        return email;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setFone(String fone){
        this.fone=fone;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void inserir() {
        String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";
        try (Connection c = new ConnectionFactory().obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir: " + e.getMessage());
        }
    }

    public void atualizar() {
        String sql = "UPDATE tb_pessoa SET nome = ?, fone = ?, email = ? WHERE codigo = ?";
        try (Connection c = new ConnectionFactory().obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.setInt(4, codigo);
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
        }
    }

    public void apagar() {
        String sql = "DELETE FROM tb_pessoa WHERE codigo = ?";
        try (Connection c = new ConnectionFactory().obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao apagar: " + e.getMessage());
        }
    }

    public void listar() {
        String sql = "SELECT * FROM tb_pessoa";
        StringBuilder resultado=new StringBuilder();
        try (Connection c = new ConnectionFactory().obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                resultado.append (String.format("Código: %d, Nome: %s, Fone: %s, Email: %s",
                        rs.getInt("codigo"),
                        rs.getString("nome"),
                        rs.getString("fone"),
                        rs.getString("email")));
                JOptionPane.showMessageDialog(null, resultado.toString());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar: " + e.getMessage());
        }
    }
}