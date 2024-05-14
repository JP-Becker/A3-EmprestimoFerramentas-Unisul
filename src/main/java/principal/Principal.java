package principal;

import dao.AmigoDAO;
import view.FrmMenuPrincipal;

public class Principal {
    public static void main(String[] args) {
        // instanciando o objeto FrmMenuPrincipal e setando visible como true para aparecer
        FrmMenuPrincipal objetoTela = new FrmMenuPrincipal();
        objetoTela.setVisible(true);
        
        AmigoDAO objAmgDAO = new AmigoDAO();
        System.out.println("Lista de amigos: " + objAmgDAO.getMinhaLista() );
    }
}
