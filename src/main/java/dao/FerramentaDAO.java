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
}
