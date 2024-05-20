package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import modelo.Emprestimo;
import utils.Utils;

public class EmprestimoDAO {
    public static ArrayList<Emprestimo> minhaLista = new ArrayList<>();
    
      // retorna a lista com todos os emprestimos
    public ArrayList<Emprestimo> getMinhaLista() {
        minhaLista.clear();
        
         // usando o bloco try catch para tratar possíveis erros
        try {
            // instanciando interface Statement para utilizar métodos SQL
            Statement stmt = Utils.getConexao().createStatement();

            // usando a classe resultSet para utilizar métodos getters do SQL
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos");

            // loop para percorrer todas as linhas da tabela
            while (res.next()) {
                // vai buscar e retornar a lista com todos os objetos 'Emprestimo'
                int idEmprestimo = res.getInt("idEmprestimo");
                Date dataEmprestimo = res.getDate("dataEmprestimo");
                Date dataDevolucao = res.getDate("dataDevolucao");
                boolean pendente = res.getBoolean("pendente");

                Emprestimo objeto = new Emprestimo(idEmprestimo, dataEmprestimo, dataDevolucao, pendente);
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
    
     // retorna o Emprestimo procurado pela id
    public Emprestimo carregaEmprestimoPorId(int id) {
        Emprestimo objeto = new Emprestimo();
        objeto.setIdEmprestimo(id);

         // usando o bloco try catch para tratar possíveis erros
        try {
            Statement stmt = Utils.getConexao().createStatement();

            // usando a classe resultSet para utilizar métodos getters referentes a tipos de dado do SQL
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos WHERE idEmprestimo = " + id);
            res.next();

            objeto.setDataEmprestimo(res.getDate("dataEmprestimo"));
            objeto.setDataDevolucao(res.getDate("dataDevolucao"));
            objeto.setPendente(res.getBoolean("pendente"));

            stmt.close();

        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        }

        return objeto;
    }
}
