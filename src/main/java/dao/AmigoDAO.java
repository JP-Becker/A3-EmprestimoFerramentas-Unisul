package dao;
import java.sql.*;
import java.util.ArrayList;
import model.Amigo;
import utils.Utils;

// FEITO POR JOÃO
public class AmigoDAO {

    public static ArrayList<Amigo> minhaLista = new ArrayList<>();
   
    // retorna a lista com todos os amigos cadastrados 
    public ArrayList<Amigo> getMinhaLista() {
        minhaLista.clear();
        
         // usando o blocm try catch para tratar possíveis erros
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
            // printando o erro específico no console 
            e.printStackTrace();
            return null;
        }
        return minhaLista;
    }
    
    // retorna o amigo procurado pela id
    public Amigo carregaAmigoPorId(int id) {
        Amigo objeto = new Amigo();
        objeto.setIdAmigo(id);

         // usando o blocm try catch para tratar possíveis erros
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
    
     // Método para cadastrar novo amigo
    public boolean insertAmigoBD(Amigo objeto) {
        // variável para guardar o comando SQL a ser executado pelo método
        String sql = "INSERT INTO tb_amigos(idAmigo, nomeAmigo, idade, emprestimosTotais, emprestimosAtivos) VALUES (?,?,?,?,?)";

        // usando o blocm try catch para tratar possíveis erros
        try {
            //objeto que representa uma instrução SQL a ser executada
            PreparedStatement stmt = Utils.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getIdAmigo());
            stmt.setString(2, objeto.getNomeAmigo());
            stmt.setString(2, objeto.getTelefone());
            stmt.setInt(3, objeto.getEmprestimosTotais());
            stmt.setInt(5, objeto.getEmprestimosAtivos());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Erro: " + e);
            throw new RuntimeException(e);
        }
    }

    // método para retornar a maior ID da lista da BD
    public int maiorID() {
        int maiorID = 0;

        try {
            Statement stmt = Utils.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_amigos");

            res.next();
            maiorID = res.getInt("idAmigo");
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        }
        
        return maiorID;
    }

}
