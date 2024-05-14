
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {
    public static Connection getConexao() {
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
}
