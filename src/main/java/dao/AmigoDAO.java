package dao;
import java.sql.*;
import java.util.ArrayList;
import model.Amigo;
import utils.Utils;

// FEITO POR JOÃO
public class AmigoDAO {
    public static ArrayList<Amigo> minhaLista = new ArrayList<>();
   
    public ArrayList<Amigo> getMinhaLista() {
        minhaLista.clear();

        try {
            // instanciando interface Statement para utilizar métodos SQL
            Statement stmt = Utils.getConexao().createStatement();

            // usando a classe resultSet para utilizar métodos getters do SQL
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos");

            // loop para percorrer todas as linhas da tabela
            while (res.next()) {
                // vai buscar e retornar a lista com todos os objetos 'Amigo'
                int idAmigo = res.getInt("idAmigo");
                String nomeAmigo = res.getString("nomeAmigo");
                String telefone = res.getString("telefone");
                int emprestimosTotais = res.getInt("emprestimosTotais");
                int emprestimosAtivos = res.getInt("emprestimosAtivos");

                Amigo objeto = new Amigo(idAmigo, nomeAmigo, telefone, emprestimosTotais, emprestimosAtivos);
                minhaLista.add(objeto);

                res.close();
                stmt.close();
            }
        } catch (SQLException e) {
            return null;
        }
        return minhaLista;
    }
}
