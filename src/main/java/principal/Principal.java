package principal;

import modelo.Amigo;
import visao.FrmMenuPrincipal;

public class Principal {
    public static void main(String[] args) {
        // instanciando o objeto FrmMenuPrincipal e setando visible como true para aparecer
        FrmMenuPrincipal objetoTela = new FrmMenuPrincipal();
        objetoTela.setVisible(true);
        
        Amigo objetoAmigo = new Amigo();
        System.out.println(objetoAmigo.getMinhaLista().toString());
    }
}
