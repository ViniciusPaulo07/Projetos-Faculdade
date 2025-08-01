
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class EstadosDAO {

    public List<Estado> findAll() throws SQLException{
        String sql = "SELECT nome, uf FROM estado";
        try(
                Connection conn = DBConnection.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql)
        ){
            List<Estado> lista = new ArrayList<>();
            while(rs.next()){
                lista.add(new Estado(
                        rs.getString("nome"),
                        rs.getString("uf")
                ));
            }
                return lista;
        }
    }
    public void save(Estado e) throws SQLException{
        String sql = "INSERT INTO estado (nome, uf) VALUES (?, ?)";
        try(
                Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ){
            ps.setString(1, e.getNome());
            ps.setString(2, e.getUf());
            ps.executeUpdate();
        }
    }
}

