package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Amigo;
import utils.Utils;

// FEITO POR JOÃO
public class AmigoDAO {

    public static ArrayList<Amigo> minhaLista = new ArrayList<>();
   
    // retorna a lista com todos os amigos cadastrados 
    public ArrayList<Amigo> getMinhaLista() {
        minhaLista.clear();
        
         // usando o bloco try catch para tratar possíveis erros
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
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos WHERE idAmigo = " + id);
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
    public boolean inserirAmigoBD(Amigo objeto) {
        // variável para guardar o comando SQL a ser executado pelo método
        String sql = "INSERT INTO tb_amigos(idAmigo, nomeAmigo, telefone, emprestimosTotais, emprestimosAtivos) VALUES (?,?,?,?,?)";

        // usando o bloco try catch para tratar possíveis erros
        try {
            //objeto que representa uma instrução SQL a ser executada
            PreparedStatement stmt = Utils.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getIdAmigo());
            stmt.setString(2, objeto.getNomeAmigo());
            stmt.setString(3, objeto.getTelefone());
            stmt.setInt(4, objeto.getEmprestimosTotais());
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
            ResultSet res = stmt.executeQuery("SELECT MAX(idAmigo) idAmigo FROM tb_amigos");

            res.next();
            maiorID = res.getInt("idAmigo");
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        }
        
        return maiorID;
    }
    
    //Método para deletar amigo da BD
    public boolean deletarAmigoBD (int idAmigo) {
         try {
            Statement stmt = Utils.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_amigos WHERE idAmigo = " +  idAmigo);
            stmt.close();
            
            return true;

        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            throw new RuntimeException(e);
        }
    }
    
    // método para alterar dados de algum amigo
    public boolean atualizarAmigoBD (Amigo objeto) {
        String sql = "UPDATE tb_amigos set nomeAmigo = ? ,telefone = ? ,emprestimosTotais = ? ,emprestimosAtivos = ? WHERE idAmigo = ?";
        
        try {
            //objeto que representa uma instrução SQL a ser executada
            PreparedStatement stmt = Utils.getConexao().prepareStatement(sql);
            
            
            stmt.setString(1, objeto.getNomeAmigo());
            stmt.setString(2, objeto.getTelefone());
            stmt.setInt(3, objeto.getEmprestimosTotais());
            stmt.setInt(4, objeto.getEmprestimosAtivos());
            stmt.setInt(5, objeto.getIdAmigo());
            stmt.execute(); // Executando a operação
            
            stmt.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            throw new RuntimeException(e);
        }
    }
}
