package dao;
import java.sql.*;
import java.util.ArrayList;
import model.Amigo;


// FEITO POR JOÃO
public class AmigoDAO {
    public static ArrayList<Amigo> minhaLista = new ArrayList<>();
    
    public Connection getConexao() {
        Connection connection = null;
        
        try {
            // Carregando o driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            
            //Configurando o servidor
            String server = "localhost";
            String database = "db_a3";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "root";
            
            //Conectando
            connection = DriverManager.getConnection(url, user, password);
            
            // Testando pra ver se conectou e imprimindo no console
            if (connection != null) {
                System.out.println("Status- conectado!");
            } else {
                System.out.println("Status- NÃO FOI POSSIVEL CONECTAR!");
            }
            
            return connection;
        } catch (ClassNotFoundException e) { // Driver não encontrado
            System.out.println("O driver não foi encotrado");
            return null;
        } catch (SQLException e) {
            System.out.println("Erro- " + e);
            return null;
        }
    }
    
    public ArrayList<Amigo> getMinhaLista() {
        minhaLista.clear();

        try {
            // instanciando interface Statement para utilizar métodos SQL
            Statement stmt = this.getConexao().createStatement();

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
