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

                
            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return minhaLista;
    }
    
    // retorna o amigo procurado pela id
    public Amigo carregaAmigo(int id) {
        Amigo objeto = new Amigo();
        objeto.setIdAmigo(id);

        try {
            Statement stmt = Utils.getConexao().createStatement();

            // usando a classe resultSet para utilizar métodos getters referentes a tipos de dado do SQL
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_alunos WHERE id = " + id);
            res.next();

            objeto.setNomeAmigo(res.getString("nome"));
            objeto.setTelefone(res.getString("telefone"));
            objeto.setEmprestimosTotais(res.getInt("emprestimosTotais"));
            objeto.setEmprestimosAtivos(res.getInt("emprestimosAtivos"));

            stmt.close();

        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        }

        return objeto;
    }

}
