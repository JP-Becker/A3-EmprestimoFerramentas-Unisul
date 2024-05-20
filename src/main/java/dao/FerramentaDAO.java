package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Ferramenta;
import utils.Utils;

public class FerramentaDAO {
     public static ArrayList<Ferramenta> minhaLista = new ArrayList<>();
   
    // retorna a lista com todas as Ferramentas cadastrados 
    public ArrayList<Ferramenta> getMinhaLista() {
        minhaLista.clear();
        
         // usando o bloco try catch para tratar possíveis erros
        try {
            // instanciando interface Statement para utilizar métodos SQL
            Statement stmt = Utils.getConexao().createStatement();

            // usando a classe resultSet para utilizar métodos getters do SQL
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas");

            // loop para percorrer todas as linhas da tabela
            while (res.next()) {
                // vai buscar e retornar a lista com todos os objetos 'Ferramenta'
                int idFerramenta = res.getInt("idFerramenta");
                String nomeFerramenta = res.getString("nomeFerramenta");
                String marca = res.getString("marca");
                double custo = res.getInt("custo");
                boolean emprestada = res.getBoolean("emprestada");

                Ferramenta objeto = new Ferramenta(idFerramenta, nomeFerramenta, marca, custo, emprestada);
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
    
    // retorna o Ferramenta procurado pela id
    public Ferramenta carregaFerramentaPorId(int id) {
        Ferramenta objeto = new Ferramenta();
        objeto.setIdFerramenta(id);

         // usando o bloco try catch para tratar possíveis erros
        try {
            Statement stmt = Utils.getConexao().createStatement();

            // usando a classe resultSet para utilizar métodos getters referentes a tipos de dado do SQL
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas WHERE idFerramenta = " + id);
            res.next();

            objeto.setNomeFerramenta(res.getString("nomeFerramenta"));
            objeto.setMarca(res.getString("marca"));
            objeto.setCusto(res.getDouble("custo"));
            objeto.setEmprestada(res.getBoolean("emprestada"));

            stmt.close();

        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        }

        return objeto;
    }
    
     // Método para cadastrar novo Ferramenta
    public boolean inserirFerramentaBD(Ferramenta objeto) {
        // variável para guardar o comando SQL a ser executado pelo método
        String sql = "INSERT INTO tb_ferramentas(idFerramenta, nomeFerramenta, marca, custo, emprestada) VALUES (?,?,?,?,?)";

        // usando o bloco try catch para tratar possíveis erros
        try {
            //objeto que representa uma instrução SQL a ser executada
            PreparedStatement stmt = Utils.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getIdFerramenta());
            stmt.setString(2, objeto.getNomeFerramenta());
            stmt.setString(3, objeto.getMarca());
            stmt.setDouble(4, objeto.getCusto());
            stmt.setBoolean(5, objeto.getEmprestada());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Erro: " + e);
            throw new RuntimeException(e);
        }
    }
    
    public int maiorID() {
        int maiorID = 0;

        try {
            Statement stmt = Utils.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(idFerramenta) idFerramenta FROM tb_ferramentas");

            res.next();
            maiorID = res.getInt("idFerramenta");
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        }
        
        return maiorID;
    }
    
    //Método para deletar Ferrmaneta da BD
    public boolean deletarFerramentaBD (int id) {
         try {
            Statement stmt = Utils.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_ferrmanetas WHERE idFerrmaneta = " +  id);
            stmt.close();
            
            return true;

        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            throw new RuntimeException(e);
        }
    }
    
     // método para alterar dados de alguma Ferramenta
    public boolean atualizarFerramentaBD (Ferramenta objeto) {
        String sql = "UPDATE tb_ferramentas set nomeFerramenta = ? ,marca = ? ,custo = ? ,emprestada = ? WHERE idFerramenta = ?";
        
        try {
            //objeto que representa uma instrução SQL a ser executada
            PreparedStatement stmt = Utils.getConexao().prepareStatement(sql);
            
            
            stmt.setString(1, objeto.getNomeFerramenta());
            stmt.setString(2, objeto.getMarca());
            stmt.setDouble(3, objeto.getCusto());
            stmt.setBoolean(4, objeto.getEmprestada());
            stmt.setInt(5, objeto.getIdFerramenta());
            stmt.execute(); // Executando a operação
            
            stmt.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            throw new RuntimeException(e);
        }
    }

}
